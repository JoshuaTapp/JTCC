package project04;

import java.lang.reflect.Array;
import java.time.LocalDate;

public abstract class SportEvent extends Event {


    private String league;
    private String[] teams = new String[2];
    private int[] scores = new int[2];
    private static int NumberOfObjects;

    //Constructor

    public SportEvent(String name, String place, LocalDate dateTime, int audience, String[] teams, int[] scores, String league){
        super(name,place,dateTime,audience);
        this.setTeams(teams);
        this.setScores(scores);
        this.setLeague(league);
        this.setNumberOfObjects();

    }

    //GETTERS AND SETTERS
    public static void setNumberOfObjects(){
        NumberOfObjects += 1;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return String.format("%s %s", (super.toString()), (String.format("[teams = %s vs %s, scores = %s - %s, %s won, league = %s]", Array.get(this.getTeams(), 0), Array.get(this.getTeams(), 1), Array.get(this.getScores(), 0), Array.get(this.getScores(), 1), this.winner(), this.getLeague())));
    }

    public String winner(){
        final int s1 = (int) Array.get(this.getScores(), 0);
        final int s2 = (int) Array.get(this.getScores(), 1);
        final String t1 = (String) Array.get(this.getTeams(), 0);
        final String t2 = (String) Array.get(this.getTeams(), 1);

        if(s1 > s2) return t1;
        else if (s1 < s2) return t2;
        else return (Math.random() > 0.499999999999999 ?  t1 : t2);
        }
}



