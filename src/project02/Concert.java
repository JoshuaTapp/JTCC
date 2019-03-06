package project02;

import java.util.Date;

public class Concert extends MusicEvent implements GoodWeather{

    private Weather weather;
    private String Type;
    private static int NumberOfObjects = 0;

    //Constructor
    public Concert(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather) {
        super(name,place,dateTime,audience,performers);

        this.setType(type);
        this.setWeather(weather);
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);
    }


    //GETTERS AND SETTERS

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
    }


    @Override
    public String toString() {
        return String.format("[class = %s, name = %s, place = %s, date/time = %s, %s, audience = %s] %n[performers = %s][type = %s, %s]",
                this.getClass().getSimpleName(),
                this.getName(),
                this.getPlace(),
                this.formatDate(this.getDateTime()),
                Week.isWeekEnd(this.getDateTime()),
                this.getAudience(),
                this.printArray(this.getPerformers()),
                this.getType(),
                this.getWeather().isGoodWeather() ? "Good Weather" : "Bad Weather" );
    }

    @Override
    public boolean isGoodWeather(){
        return this.getWeather().isGoodWeather();
    }
}
