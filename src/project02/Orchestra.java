package project02;

import java.util.Date;

public class Orchestra extends MusicEvent{

    private boolean casualAttire;
    private static int NumberOfObjects = 0;


    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers, boolean attire) {
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
        this.setPerformers(performers);
        this.setCasualAttire(attire);
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
    }

    public boolean isCasualAttire() {
        return casualAttire;
    }

    public void setCasualAttire(boolean casualAttire) {
        this.casualAttire = casualAttire;
    }


    @Override
    public String toString() {
        return String.format("[class = %s, name = %s, place = %s, date/time = %s, %s, audience = %s] %n[performers = %s] [%s]",
                this.getClass().getSimpleName(),
                this.getName(),
                this.getPlace(),
                this.formatDate(),
                Week.isWeekEnd(this.getDateTime()),
                this.getAudience(),
                this.printArray(getPerformers()),
                this.isCasualAttire() ? "Casual Attire" : "Formal Attire");
    }
}
