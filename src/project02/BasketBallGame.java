package project02;

import java.util.Date;

public class BasketBallGame extends SportEvent {

    private static int NumberOfObjects = 0;


    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) {

        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
        this.setTeams(teams);
        this.setScores(scores);
        this.setLeague(league);
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
    }

    @Override
    public String toString() {

        return
                String.format("[class = %s, name = %s, place = %s, date/time = %s, %s, audience = %s] %n[teams = %s vs %s, scores = %s - %s, %s, league = %s]",
                        this.getClass().getSimpleName(),
                        this.getName(),
                        this.getPlace(),
                        this.formatDate(),
                        Week.isWeekEnd(this.getDateTime()),
                        this.getAudience(),
                        this.team(0),
                        this.team(1),
                        this.score(0),
                        this.score(1),
                        this.whoWinner(this.getTeams(), this.getScores()),
                        this.getLeague() );
    }
}

