package project02;

import java.util.Date;

public class SoccerGame extends SportEvent implements GoodWeather {

    private Weather weather;
    private static int NumberOfObjects = 0;


    //Constructor
    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) {
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
        this.setTeams(teams);
        this.setScores(scores);
        this.setLeague(league);
        this.setWeather(weather);
        SoccerGame.setNumberOfObjects(SoccerGame.getNumberOfObjects() + 1);
    }


    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
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
                String.format("[class = %s, name = %s, place = %s, date/time = %s, %s, audience = %s] %n[teams = %s vs %s, scores = %s - %s, %s, league = %s] [%s]",
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
                        this.getLeague(),
                        this.getWeather().isGoodWeather() ? "Good Weather" : "Bad Weather" );
    }

    @Override
    public boolean isGoodWeather(){
        return this.getWeather().isGoodWeather();
    }
}

