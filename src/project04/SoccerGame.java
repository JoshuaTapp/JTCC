/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project04;

import java.lang.String;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;

import project04.GoodWeather;

public final class SoccerGame extends SportEvent implements GoodWeather {

    private static final ArrayList<SoccerGame> eventList = new ArrayList<SoccerGame>();
    private Weather weather;

    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, teams, scores, league);
        this.setWeather(weather);
        SoccerGame event = this;
        SoccerGame.eventList.add(event);
    }  // SoccerGame()

    public static ArrayList getEventList() {return SoccerGame.eventList;}

    public static int getNumberOfObjects() {return SoccerGame.getEventList().size();}

    public Weather getWeather()         {return this.weather;}

    public void    setWeather(Weather weather) {this.weather = weather;}

    @Override  // project3.GoodWeather.iaGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;}

    @Override  // project3.SportEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class SoccerGame