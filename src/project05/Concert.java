/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

/*
 * Created on 4/30/19 1:43 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project05;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public final class Concert extends MusicEvent implements GoodWeather {

    private static final ArrayList<Concert> eventList = new ArrayList<Concert>();
    private String  type   ;
    private Weather weather;

    public Concert(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setType(type); this.setWeather(weather);
        Concert event = this;
        Concert.eventList.add(event);
    }  // Concert()

    public static ArrayList getEventList() {return Concert.eventList;}

    public static int getNumberOfObjects() {return Concert.getEventList().size();}

    public String getType()     {return this.type;}

    public void   setType(String type) {this.type = type;}

    public Weather getWeather()         {return this.weather;}

    public void    setWeather(Weather weather) {this.weather = weather;}

    @Override  // project3.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather();}

    @Override  // project3.MusicEvent.toString()
    public String toString() {return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class Concert