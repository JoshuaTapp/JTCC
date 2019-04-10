package project04;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.time.LocalDateTime;

class EventPane implements ButtonAction {

    Pane pane;

    EventPane() {
    }

    // Pane Assets

    Label name = new Label("Name:");
    Label eventDate = new Label("Date (mm/dd/yyyy):");
    Label audience = new Label("Audience:");
    Label place = new Label("Place:");
    Label time = new Label("Time (hh:mm):");
    Label isWeekend = new Label("Weekend:");
    Label success = new Label();

    Button clear = new Button("Clear");
    Button submit = new Button("Submit");

    TextField nameField = new TextField();
    TextField dateField = new TextField();
    TextField audienceField = new TextField();
    TextField placeField = new TextField();
    TextField timeField = new TextField();

    RadioButton weekendYes = new RadioButton("YES");
    RadioButton weekendNo = new RadioButton("NO");

    final ToggleGroup radioGroup = new ToggleGroup();
    GridPane grid = new GridPane();
    HBox    radios = new HBox();

    {
        // CREATE PANE

        // Setup ToggleGroup & disable buttons from user
        weekendYes.setToggleGroup(radioGroup);
        weekendNo.setToggleGroup(radioGroup);
        weekendYes.setDisable(true);
        weekendNo.setDisable(true);
        weekendNo.setOpacity(100);
        weekendYes.setOpacity(100);
        radios.getChildren().addAll(weekendYes, weekendNo);
        radios.setSpacing(25);

        //ROW 0
        grid.add(name, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(place, 2, 0);
        grid.add(placeField, 3, 0);
        //ROW 1
        grid.add(eventDate, 0, 1);
        grid.add(dateField, 1, 1);
        grid.add(time, 2, 1);
        grid.add(timeField, 3, 1);
        //ROW 2
        grid.add(audience, 0, 2);
        grid.add(audienceField, 1, 2);
            // Add the other nodes in the subclasses.
        //ROW 3
        grid.addRow(3);
        //ROW 4
        grid.addRow(4);
        //ROW 5
        grid.addRow(5);
        //ROW 6
        grid.addRow(6);
        //RPW 7
        grid.add(clear, 0, 7);
        grid.add(submit, 2, 7);
        //ROW 8
        grid.addRow(8);
        //ROW 9
        grid.add(isWeekend, 0, 9);
        grid.add(radios, 1, 9);

        //FORMATTING
        grid.setHgap(10);
        grid.setPadding(new Insets( 25));
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setVgap(5);
        pane = grid;

        // EVENT HANDLERS

            // SUBMIT BUTTON ACTION
            submit.setOnAction(this::submitButtonAction);

            // CLEAR BUTTON ACTION
            clear.setOnAction(this::clearButtonAction);
    }


    public void submitButtonAction(ActionEvent event) {
        this.submitTask();
    }

    public void clearButtonAction(ActionEvent event) {
        this.clearTask();
    }

    Pane getPane() {
        return this.pane;
    }

    public void createEvent() {
        new Event(this.nameField.getText(), this.placeField.getText(), Event.parseDate(this.dateField.getText() + " " + this.timeField.getText()), Integer.parseInt(this.audienceField.getText()));
    }

    public void clearTask() {
        this.nameField.clear();
        this.dateField.clear();
        this.audienceField.clear();
        this.placeField.clear();
        this.timeField.clear();
        this.weekendYes.setSelected(false);
        this.weekendNo.setSelected(false);
        this.success.setText("");
    }

    public void submitTask() {
        try {
            LocalDateTime date = Event.parseDate(this.dateField.getText() + this.timeField.getText());
            String str = Week.isWeekEnd(date);

            if (str.equals("Weekend")) { this.weekendYes.setSelected(true); }
            else if (str.equals("Weekday")) { this.weekendNo.setSelected(true); }
            this.success.setText("Success");
        } catch (Exception e) {
            System.out.print("ERROR");
        }
    }
}


