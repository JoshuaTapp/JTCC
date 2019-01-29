package project01;

import java.util.Scanner;

public class SoccerGame {
        public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);

                   int teamOneScore = 0, teamTwoScore = 0;


            String team1 = "no team", team2 = "no team", yes = "Yes", name = "";

            // Enter team 1s name
            System.out.print("Enter the team names: ");
            team1 = input.next();
            // Enter team 2s name
            team2 = input.next();


            for(boolean isDone = false; isDone == false; ){
                // Enter minute of game
                System.out.print("Has game ended? ");
                name = input.next();
                if (name.equals(yes)){
                    isDone = true;
                }

                else {
                    System.out.print("Enter minute of game: ");
                    int time =  input.nextInt();

                    if (time >0 && time < 120){

                        System.out.print("Enter " + team1 +" score: ");
                        teamOneScore = input.nextInt();
                        System.out.print("Enter " + team2 +" score: ");
                        teamTwoScore = input.nextInt();


                        SoccerMatch match = new SoccerMatch(team1, team2, time, teamOneScore, teamTwoScore);

                        System.out.println("The minute is " + match.getTime());
                        System.out.println(team1 + " " + match.getTeamOneScore() + " "+ team2 + " " + match.getTeamTwoScore());
                    }

                    else System.out.println("Invalid time");
                }

            }
            System.out.println("Final: " + team1 + " " + teamOneScore + " "+ team2 + " " + teamTwoScore);

            if (teamOneScore > teamTwoScore){
                System.out.println(team1 + " have won");
            }
            else if (teamOneScore < teamTwoScore){
                System.out.println(team2 + " have won");
            }
            else {
                System.out.println(team1 +  " and " + team2 +  " have drawn");
            }
        }
    }
