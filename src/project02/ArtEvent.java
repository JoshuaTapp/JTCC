package project02;


import java.util.Date;

public class ArtEvent extends Event {

    String type;
    private static int NumberOfObjects = 0;


    //Constructor
    public ArtEvent(String name, String place , Date dateTime, int audience, String type){
        super(name, place, dateTime, audience);
        this.setType(type);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        NumberOfObjects += 1;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s [type = %s]", super.toString(), this.getType());
    }
}
