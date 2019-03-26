package project03;

import java.util.Date;

public class BasketBallGame extends SportEvent {

    private static int NumberOfObjects;


    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) {

        super(name, place, dateTime, audience, teams, scores, league);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        NumberOfObjects += 1;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}

