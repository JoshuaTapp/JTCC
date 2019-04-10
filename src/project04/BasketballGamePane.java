package project04;

import java.time.LocalDateTime;

public class BasketballGamePane extends SportEventPane {
    BasketballGamePane() {
    }

    @Override
        public void createEvent() {
            String[] teams = {this.teamOneField.getText(), this.teamTwoField.getText()};
            int[]   scores = {Integer.parseInt(this.scoreOneField.getText()), Integer.parseInt(this.scoreTwoField.getText()) };

            new BasketBallGame(this.nameField.getText(), this.placeField.getText(), Event.parseDate(this.dateField.getText() + this.timeField.getText()), Integer.parseInt(this.audienceField.getText()), teams, scores, this.leagueField.getText() );
            System.out.println(Event.getEventList().toString());
        }


    @Override
        public void submitTask() {
           try {
                LocalDateTime date = Event.parseDate(this.dateField.getText() + this.timeField.getText());
                String str = Week.isWeekEnd(date);

                createEvent();

                if (str.equals("Weekend")) { this.weekendYes.setSelected(true); }
                else if (str.equals("Weekday")) { this.weekendNo.setSelected(true); }

                SportEvent tempEvent = (SportEvent) Event.getEventList().get(Event.getEventList().size() - 1);
                this.winnerField.setText(tempEvent.winner());

                System.out.println("Success");
           } catch (Exception e) {
                System.out.print("ERROR");
            }
        }
    }
