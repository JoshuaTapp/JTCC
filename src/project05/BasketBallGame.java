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

public final class BasketBallGame extends SportEvent {

    private static final ArrayList<BasketBallGame> eventList = new ArrayList<BasketBallGame>();

    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] players, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience, players, scores, league);
        BasketBallGame event = this;
        BasketBallGame.eventList.add(event);
    }  // BasketBallGame()

    public static ArrayList getEventList() {return BasketBallGame.eventList;}              // static method, cannot be over-ridden

    public static int getNumberOfObjects() {return BasketBallGame.getEventList().size();}  // static method, cannot be over-ridden

    @Override  // project3.SportEvent.toString()
    public String toString() {return super.toString();}

}  // class BaseketBallGame