/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project04;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public final class ArtEvent extends Event {

    private static final ArrayList<ArtEvent> eventList = new ArrayList<ArtEvent>();
    private String type;

    protected ArtEvent(String name, String place, Date dateTime, int audience, String type) throws ParseException {
        super(name, place, dateTime, audience);
        this.setType(type);
        ArtEvent event = this;
        ArtEvent.eventList.add(event);
    }  // ArtEvent()

    public static ArrayList getEventList() {return ArtEvent.eventList;}

    public static int getNumberOfObjects() {return ArtEvent.getEventList().size();}

    public String     getType()     {return this.type;}

    public final void setType(String type) {this.type = type;}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [type = " + this.getType() + "]";}

}  // class MusicEvent