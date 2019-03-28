package project04;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Week {

    public static String isWeekEnd(LocalDate date) {
        Instant instant = Instant.from(date.atStartOfDay(ZoneId.of("EST")));
        Date dateDate = Date.from(instant);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateDate);
        return (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7) ? "Weekend" : "Weekday";
    }  // isWeekEnd()
}  // class Week