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

public class SportEvent extends Event {

    //    private static final ArrayList<Event> eventList = new ArrayList<Event>();
    private static final ArrayList<SportEvent> eventList = new ArrayList<SportEvent>();
    private String[] teams  = new String[2];
    private int   [] scores = new int   [2];
    private int      winnerIndex;
    private int      loserIndex;
    private String   league;

    protected SportEvent(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience);
        this.setTeams(teams); this.setScores(scores); this.setLeague(league);
        SportEvent event = this;
        SportEvent.eventList.add(event);
    }  // SportEvent()

    public static ArrayList getEventList() {return SportEvent.eventList;}              // static method, cannot be over-ridden

    public static int getNumberOfObjects() {return SportEvent.getEventList().size();}  // static method, cannot be over-ridden

    public String[]   getTeams()        {return this.teams;}

    public final void setTeams(String[] teams) {this.teams = teams;}

    public int[] getScores() {return this.scores;}

    public final void setScores(int[] scores) {
        this.scores = scores;
        if (scores[0] > scores[1]) this.winnerIndex = 0;
        else if (scores[0] < scores[1]) this.winnerIndex = 1;
        else                            this.winnerIndex = (Math.random() < 0.5) ? 0 : 1;
        this.loserIndex = (this.winnerIndex == 1) ? 0 : 1;
    }  // setScores()

    public int getWinnerIndex() {return this.winnerIndex;}

    public int getLoserIndex () {return this.loserIndex ;}

    public String     getLeague()       {return this.league;}

    public final void setLeague(String league) {this.league = league;}

    public String getWinnerName() {return this.getTeams()[this.getWinnerIndex()];}
    public String getLoserName () {return this.getTeams()[this.getLoserIndex ()];}

    public int getWinnerScore() {return this.getScores()[this.getWinnerIndex()];}
    public int getLoserScore () {return this.getScores()[this.getLoserIndex ()];}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [teams = " + this.getTeams()[0] + " vs " + this.getTeams()[1] + ", scores = " + this.getScores()[0] + " - " + this.getScores()[1] + ", " + this.getWinnerName() + " won, league = " + this.getLeague() + "]";}

}  // class SportEvent