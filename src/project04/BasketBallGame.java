package project04;

import java.time.LocalDate;

public class BasketBallGame extends SportEvent {

    private static int NumberOfObjects;


    public BasketBallGame(String name, String place, LocalDate dateTime, int audience, String[] teams, int[] scores, String league) {

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

