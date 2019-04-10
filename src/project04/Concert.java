package project04;

import java.time.LocalDateTime;

public class Concert extends MusicEvent implements GoodWeather {

    private Weather weather;
    private String Type;
    private static int NumberOfObjects = 0;

    //Constructor
    public Concert(String name, String place, LocalDateTime dateTime, int audience, String[] performers, String type, Weather weather) {
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
        return String.format("%s [type = %s, %s]",
                super.toString(),
                this.getType(),
                (this.isGoodWeather()) ? "Good Weather" : "Bad Weather");
    }

    @Override
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather();
    }

}
