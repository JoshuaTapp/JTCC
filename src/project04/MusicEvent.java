/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project04;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MusicEvent extends Event {

    private static final ArrayList<MusicEvent> eventList = new ArrayList<MusicEvent>();
    private String[] performers;

    protected MusicEvent(String name, String place, Date dateTime, int audience, String[] performers) throws ParseException {
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        MusicEvent event = this;
        MusicEvent.eventList.add(event);
    }  // MusicEvent()

    public static ArrayList getEventList() {return MusicEvent.eventList;}

    public static int getNumberOfObjects() {return MusicEvent.getEventList().size();}

    public String[]   getPerformers()             {return this.performers;}

    public final void setPerformers(String[] performers) {this.performers = performers;}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [performers = " + Arrays.toString(this.getPerformers()) + "]";}

}  // class MusicEvent