package project04;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Event {
    private String name;
    private String place;
    private LocalDate dateTime;
    private int audience;
    private static int NumberOfObjects;
    private static List<Event> EventList = new ArrayList<>();

    //Constructors
    public Event(String name, String place, LocalDate dateTime, int audience) {
        this.setNumberOfObjects();
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
        EventList.add(this);
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

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
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

    public static List<Event> getEventList() {
        return EventList;
    }

    public static void setEventList(List<Event> events) {
        EventList = events;
    }

    //HELPER METHODS

    public String formatDate(LocalDate dateTime){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy kk:mm");
        return date.format(this.getDateTime());
    }

    public static LocalDate parseDate(String str){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.parse(str, dateFormat);
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

