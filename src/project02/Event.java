package project02;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public abstract class Event {
    private String name;
    private String place;
    private Date dateTime;
    private int audience;
    private static int NumberOfObjects = 0;

    public Event() {
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);
    }


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

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
    }

    public String printArray(Object[] arr) {
        return Arrays.toString(arr);
    }
    public String formatDate(){
        SimpleDateFormat Date = new SimpleDateFormat("MM/dd/yyyy hh:mm");
        return Date.format(this.getDateTime());
    }

    @Override
    public String toString() {
        return
                String.format("[class = %s, name = %s, place = %s, date/time = %Tm/%Td/%TY %tH:%tM, %s, audience = %s]",
                        this.getClass().getSimpleName(),
                        this.getName(),
                        this.getPlace(),
                        this.getDateTime(),
                        this.getDateTime(),
                        this.getDateTime(),
                        this.getDateTime(),
                        this.getDateTime(),
                        Week.isWeekEnd(this.getDateTime()),
                        this.getAudience());
    }
}

