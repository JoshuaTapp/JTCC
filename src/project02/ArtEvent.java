package project02;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ArtEvent extends Event {

    String type;
    private static int NumberOfObjects = 0;


    //Constructor
    public ArtEvent(String name, String place , Date dateTime, int i, String type){
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setType(type);
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                String.format("[class = %s, name = %s, place = %s, date/time = %s, %s, audience = %s] %n[type = %s]",
                        this.getClass().getSimpleName(),
                        this.getName(),
                        this.getPlace(),
                        this.formatDate(),
                        Week.isWeekEnd(this.getDateTime()),
                        this.getAudience(),
                        this.getType() );
    }
}
