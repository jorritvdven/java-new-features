package examples;

import java.time.DayOfWeek;

public class SwitchExpressions {
    public void switchStatement(DayOfWeek day) {
        String weekPart;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                weekPart = "Early";
                break;
            case THURSDAY:
            case FRIDAY:
                weekPart = "Late";
                break;
            case SATURDAY:
            case SUNDAY:
                weekPart = "Weekend";
                break;
            default:
                throw new RuntimeException("Huh?: " + day);
        }
    }

    public void switchExpression(DayOfWeek day) {
        String weekPart = switch(day) {
            case MONDAY, TUESDAY, WEDNESDAY -> "Early";
            case THURSDAY,FRIDAY            -> "Late";
            case SATURDAY, SUNDAY           -> "Weekend";
        };
    }
}
