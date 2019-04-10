package project04;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SportEventPane extends EventPane {
    SportEventPane() {
    }

    Label team1 = new Label("Team 1:");
    Label team2 = new Label("Team 2:");
    Label league = new Label("League:");
    Label score1 = new Label("Score 1:");
    Label score2 = new Label("Score 2:");
    Label winner = new Label("Winner:");

    TextField teamOneField = new TextField();
    TextField teamTwoField = new TextField();
    TextField leagueField = new TextField();
    TextField scoreOneField = new TextField();
    TextField scoreTwoField = new TextField();
    TextField winnerField = new TextField();

    {
        winnerField.setDisable(true);
        winnerField.setOpacity(100);

        //ROW 2
        grid.add(league, 2, 2);
        grid.add(leagueField, 3, 2);
        //ROW 3
        grid.add(team1, 0, 3);
        grid.add(teamOneField, 1, 3);
        grid.add(score1, 2, 3);
        grid.add(scoreOneField, 3, 3);
        //ROW 4
        grid.add(team2, 0, 4);
        grid.add(teamTwoField, 1, 4);
        grid.add(score2, 2, 4);
        grid.add(scoreTwoField, 3, 4);

        //ROW 8
        grid.add(winner, 0, 8);
        grid.add(winnerField, 1, 8);

    }
    @Override
    public void clearTask() {
        super.clearTask();
        this.teamOneField.clear();
        this.teamTwoField.clear();
        this.scoreOneField.clear();
        this.scoreTwoField.clear();
        this.winnerField.clear();
        this.leagueField.clear();
    }

}


