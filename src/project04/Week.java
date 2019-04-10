package project04;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Week {

    public static String isWeekEnd(LocalDateTime date) {
        return (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY) ?  "Weekend" :  "Weekday"  );
    }  // isWeekEnd(
}  // class Week