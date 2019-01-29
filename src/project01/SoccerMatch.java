package project01;

//Makes an object of type SoccerMatch
public class SoccerMatch {
        private String team1;
        private String team2;
        private int time;
        private int teamOneScore;
        private int teamTwoScore;

    //Construct
        public SoccerMatch(String team1, String team2,
                           int time, int teamOneScore, int teamTwoScore) {
            this.team1 = team1;
            this.team2 = team2;
            this.time = time;
            this.teamOneScore = teamOneScore;
            this.teamTwoScore = teamTwoScore;
        }

        //SETTERS AND GETTERS
        public String getTeam1() {
            return team1;
        }
        public void setTeam1(String team1) {
            this.team1 = team1;
        }
        public String getTeam2() {
            return team2;
        }
        public void setTeam2(String team2)
        {
            this.team2 = team2;
        }
        public int getTime() {
            return time;
        }
        public void setTime(int time){

            this.time = time;
        }
        public double getTeamOneScore() {
            return teamOneScore;
        }
        public void setTeamOneScore(int teamOneScore) {
            this.teamOneScore = teamOneScore;
        }
        public double getTeamTwoScore() {
            return teamTwoScore;
        }
        public void setTeamTwoScore(int teamTwoScore) {
            this.teamTwoScore = teamTwoScore;
        }
    }
