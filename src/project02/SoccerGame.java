package project02;

import java.util.Date;

public class SoccerGame extends SportEvent implements GoodWeather {

    private Weather weather;
    private static int NumberOfObjects = 0;

    //Constructor
    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) {
        super(name,place,dateTime,audience,teams,scores,league);
        this.setWeather(weather);
        this.setNumberOfObjects();
    }

    public Weather getWeather() {
        return weather;
    }
    public void setWeather(Weather weather) {
        this.weather = weather;
    }
    public static void setNumberOfObjects(){
        NumberOfObjects += 1;
    }
    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(super.toString());
        str.append(this.isGoodWeather() ? "[Good Weather]" : "[Bad Weather]" );
        return str.toString();
    }

    @Override
    public boolean isGoodWeather(){
        return this.getWeather().isGoodWeather();
    }
}

