/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project04;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {

    private static final ArrayList<Event> eventList = new ArrayList<Event>();
    private String name    ;
    private String place   ;
    private Date   dateTime;
    private int    audience;

    public Event() {}

    protected Event(String name, String place, Date dateTime, int audience) {
        this.setName(name); this.setPlace(place); this.setDateTime(dateTime); this.setAudience(audience);
        Event event = this;
        Event.eventList.add(event);
    }  // Event()

    public static ArrayList getEventList() {return Event.eventList;}

    public static int getNumberOfObjects() {return Event.getEventList().size();}

    public String getName    () {return this.name    ;}

    public final void setName    (String name  ) {this.name     = name    ;}

    public String getPlace   () {return this.place   ;}

    public final void setPlace   (String place ) {this.place    = place   ;}

    public Date   getDateTime() {return this.dateTime;}

    public final void setDateTime(Date dateTime) {this.dateTime = dateTime;}

    public int    getAudience() {return this.audience;}

    public final void setAudience(int audience ) {this.audience = audience;}

    public String getDateTimeString() {return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.getDateTime());}

    public boolean isWeekEnd() {return Week.isWeekEnd(this.getDateTime());}
    public boolean isWeekDay() {return Week.isWeekDay(this.getDateTime());}

    @Override  // java.lang.Object.toString()
    public String toString() {return "[class = " + this.getClass().getSimpleName() + ", name = " + this.getName() + ", place = " +this.getPlace()  + ", date/time = " + this.getDateTimeString() +  ", " + ((this.isWeekEnd()) ? "Weekend" : "Weekday") + ", audience = " + this.getAudience() + "]";}

}  // class Event