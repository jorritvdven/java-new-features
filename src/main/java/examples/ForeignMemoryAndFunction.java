package examples;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

public class ForeignMemoryAndFunction {
    public static void writeFloatTOOffHeapMemory() {
        // An Arena manages off-heap memory segments
        try (Arena arena = Arena.ofConfined()) {
            int byteSize = 4;
            int index = 0;
            float value = 6;

            // Write to off-heap memory
            MemorySegment segment = arena.allocate(byteSize);
            segment.setAtIndex(JAVA_FLOAT, index, value);

            // Read from off-heap memory
            float result = segment.getAtIndex(JAVA_FLOAT, index);
        }
    }

    public static long callNativeStrlen(String str) throws Throwable {
        try (Arena arena = Arena.ofConfined()) {
            // Copy java string into a native string
            MemorySegment nativeString = arena.allocateFrom(str);

            // Create instance of the native linker
            Linker linker = Linker.nativeLinker();

            // Locate the address of the C function signature
            SymbolLookup stdLib = linker.defaultLookup();
            MemorySegment strlenAddr = stdLib.find("strlen").orElseThrow(() -> new RuntimeException("strlen not found!"));

            // Create a description of the C function
            FunctionDescriptor strlenSignature = FunctionDescriptor.of(
                    ValueLayout.JAVA_LONG, /* the return layout */
                    ValueLayout.ADDRESS /* the argument(s) */
            );

            // Create a method handle
            MethodHandle strlen = linker.downcallHandle(strlenAddr, strlenSignature);

            // call the function
            return (long) strlen.invokeExact(nativeString);
        }
    }

    public static void main(String[] args) throws Throwable{
        writeFloatTOOffHeapMemory();
        long length = callNativeStrlen("Hello, World");
        System.out.println("length is " + length);
    }
}
