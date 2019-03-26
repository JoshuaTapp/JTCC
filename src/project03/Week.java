package project03;

import java.util.Calendar;
import java.util.Date;

public class Week {

    public static String isWeekEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7) ? "Weekend" : "Weekday";
    }  // isWeekEnd()
}  // class Week