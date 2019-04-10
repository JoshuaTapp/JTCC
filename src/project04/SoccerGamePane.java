package project04;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

import java.time.LocalDateTime;

public class SoccerGamePane extends SportEventPane {
    public SoccerGamePane() {
    }
    HBox sunnyRadios = new HBox();
    HBox weatherRadios = new HBox();


    Label sunny = new Label("Sunny:");
    RadioButton sunnyYes = new RadioButton("YES");
    RadioButton sunnyNO = new RadioButton("NO");
    final ToggleGroup radioGroupSunny = new ToggleGroup();

    Label temperature = new Label("Temperature:");
    TextField tempField = new TextField();

    Label windSpeed = new Label("Wind Speed:");
    TextField windSpeedField = new TextField();

    Label humidity = new Label("Humidity:");
    TextField humidityField = new TextField();

    Label goodWeather = new Label("Good Weather:");
    RadioButton weatherGood = new RadioButton("YES");
    RadioButton weatherBad = new RadioButton("NO");
    final ToggleGroup radioGroupWeather = new ToggleGroup();

    {
        sunnyRadios.getChildren().addAll(sunnyYes, sunnyNO);
        sunnyYes.setToggleGroup(radioGroupSunny);
        sunnyNO.setToggleGroup(radioGroupSunny);
        sunnyRadios.setSpacing(25);

        weatherRadios.getChildren().addAll(weatherGood, weatherBad);
        weatherGood.setToggleGroup(radioGroupWeather);
        weatherBad.setToggleGroup(radioGroupWeather);
        weatherGood.setDisable(true);
        weatherBad.setDisable(true);
        weatherGood.setOpacity(100);
        weatherBad.setOpacity(100);
        weatherRadios.setSpacing(25);

        //ROW 5
        grid.add(sunny, 0, 5);
        grid.add(sunnyRadios, 1, 5);
        grid.add(temperature,2, 5);
        grid.add(tempField, 3,5);
        //ROW 6
        grid.add(windSpeed, 0, 6);
        grid.add(windSpeedField, 1, 6);
        grid.add(humidity,2,6);
        grid.add(humidityField, 3, 6);
        //ROW 9
        grid.add(goodWeather, 2, 9);
        grid.add(weatherRadios, 3,9);
    }

    @Override
    public void clearTask() {
        super.clearTask();
        this.sunnyYes.setSelected(false);
        this.sunnyNO.setSelected(false);
        this.tempField.clear();
        this.windSpeedField.clear();
        this.humidityField.clear();
        this.weatherGood.setSelected(false);
        this.weatherBad.setSelected(false);
    }

    @Override
    public void createEvent() {
        String[] teams = {this.teamOneField.getText(), this.teamTwoField.getText()};
        int[]   scores = {Integer.parseInt(this.scoreOneField.getText()), Integer.parseInt(this.scoreTwoField.getText()) };
        Weather weather = new Weather(this.radioGroupSunny.getSelectedToggle() == this.sunnyYes,
                Double.parseDouble(this.tempField.getText()),
                Double.parseDouble(this.windSpeedField.getText()),
                Double.parseDouble(this.humidityField.getText()));

        new SoccerGame(this.nameField.getText(), this.placeField.getText(), Event.parseDate(this.dateField.getText() + this.timeField.getText()), Integer.parseInt(this.audienceField.getText()), teams, scores, this.leagueField.getText(), weather );
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

            SoccerGame temp = (SoccerGame) Event.getEventList().get(Event.getEventList().size() - 1);
            if ((temp.isGoodWeather())) {
                weatherGood.setSelected(true);
            }
            else {
                weatherBad.setSelected(true);
            }
            SportEvent tempEvent = (SportEvent) Event.getEventList().get(Event.getEventList().size() - 1);
            this.winnerField.setText(tempEvent.winner());

            this.success.setText("Success");
        } catch (Exception e) {
            System.out.print("ERROR");
        }
    }
}
