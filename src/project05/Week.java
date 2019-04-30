/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

/*
 * Created on 4/30/19 1:43 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project05;

import java.util.Calendar;
import java.util.Date;

public class Week {

    public static boolean isWeekEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7);
    }  // isWeekEnd()

    public static boolean isWeekDay(Date date) {return !(Week.isWeekEnd(date));}

}  // class Week