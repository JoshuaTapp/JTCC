package project04;

import java.time.LocalDate;

public class Week {

    public static String isWeekEnd(LocalDate date) {
       return (date.atStartOfDay().getDayOfWeek().getValue() == 6||  date.atStartOfDay().getDayOfWeek().getValue() == 7) ?  "Weekend" : "Weekday" ;
    }  // isWeekEnd()
}  // class Week