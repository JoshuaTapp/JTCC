package project04;

import java.time.LocalDateTime;
import java.util.Arrays;

public abstract class MusicEvent extends Event {
    private String[] performers;
    private static int NumberOfObjects = 0;

    public MusicEvent(String name, String place, LocalDateTime dateTime, int audience, String[] performers) {
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        NumberOfObjects += 1;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public String[] getPerformers() {
        return performers;
    }

    public void setPerformers(String[] performers) {
        this.performers = performers;
    }

    @Override
    public String toString(){
        return String.format("%s [performers = %s]", super.toString(), Arrays.toString(this.getPerformers()) );
    }
}

