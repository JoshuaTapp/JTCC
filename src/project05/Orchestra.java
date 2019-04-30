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

public final class Orchestra extends MusicEvent {

    private static final ArrayList<Orchestra> eventList = new ArrayList<Orchestra>();
    private boolean casualAttire;

    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        Orchestra event = this;
        Orchestra.eventList.add(event);
    }  // Orchestra()

    public static ArrayList getEventList() {return Orchestra.eventList;}

    public static int getNumberOfObjects() {return Orchestra.getEventList().size();}

    public boolean  isCasualAttire() {return this.casualAttire;}

    public void    setCasualAttire(boolean casualAttire) {this.casualAttire = casualAttire;}

    @Override  // project3.MusicEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isCasualAttire()) ? "Casual Attire" : "Formal Attire") + "]";}

}  // class Orchestra