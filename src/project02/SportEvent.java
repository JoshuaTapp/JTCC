package project02;

public abstract class SportEvent extends Event {


    private String league;
    private String[] teams = new String[2];
    private int[] scores = new int[2];
    private String winner;
    private static int NumberOfObjects = 0;


    //Constructor
    public SportEvent() {
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);


    }

    //GETTERS AND SETTERS

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
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

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String team(int i) {
        if (!(i == 0 || i == 1)) {
            return "ERROR";
        }

        String[] str = this.getTeams();
        return str[i];
    }

    public int score(int i) {
        if (!(i == 0 || i == 1)) {
            return -1;
        }

        int[] str = this.getScores();
        return str[i];
    }

    public static String whoWinner(String[] str, int[] i) {

        String winner;

        if (i[0] > i[1]){
            winner = str[0] + " won";
        }
        else if(i[0] < i[1]){
            winner = str[1] + " won";
        }
        else{
           double k =  Math.round(Math.random());
            if (k > .5) winner = str[0] + "won";
            else winner = (str[1] + "won");
        }
        return winner;
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
                        this.getLeague()     );
    }

}
