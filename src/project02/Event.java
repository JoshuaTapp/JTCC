/*
 * Created on 4/30/19 12:15 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public abstract class Event {
    private String name;
    private String place;
    private Date dateTime;
    private int audience;
    private static int NumberOfObjects;

    //Constructors
    public Event(String name, String place, Date dateTime, int audience) {
        setNumberOfObjects();
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(){
        NumberOfObjects += 1;
    }

    //HELPER METHODS

    public String formatDate(Date dateTime){
        SimpleDateFormat Date = new SimpleDateFormat("M/dd/yyyy kk:mm");
        return Date.format(this.getDateTime());
    }

    //METHODS
    @Override
    public String toString() {
        return
                String.format("[class = %s, name = %s, place = %s , date/time = %s, %s, audience = %s]",
                        this.getClass().getSimpleName(),
                        this.getName(),
                        this.getPlace(),
                        this.formatDate(this.getDateTime()),
                        Week.isWeekEnd(this.getDateTime()),
                        this.getAudience());
    }
}

