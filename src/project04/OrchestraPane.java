package project04;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

import java.time.LocalDateTime;

public class OrchestraPane extends EventPane {
    public OrchestraPane() {
    }

    Label performers = new Label("Performers:");
    TextField performField = new TextField();

    HBox attireGroup = new HBox();
    Label attire = new Label("Casual Attire:");
    RadioButton casualYes = new RadioButton("YES");
    RadioButton casualNO = new RadioButton("NO");
    final ToggleGroup radioGroupAttire = new ToggleGroup();

    {
        attireGroup.getChildren().addAll(casualYes, casualNO);
        casualYes.setToggleGroup(radioGroupAttire);
        casualNO.setToggleGroup(radioGroupAttire);
        attireGroup.setSpacing(25);
        //ROW 2
        grid.add(performers, 2, 2);
        grid.add(performField, 3,2);
        //ROW 3
        grid.add(attire, 0, 3);
        grid.add(attireGroup, 1, 3);
    }

    @Override
    public void clearTask() {
        super.clearTask();
        performField.clear();
        casualYes.setSelected(false);
        casualNO.setSelected(false);
    }

    @Override
    public void createEvent() {

        String[] performersArray = this.performField.getText().split(",");

        new Orchestra(this.nameField.getText(),
                this.placeField.getText(),
                Event.parseDate(this.dateField.getText() + this.timeField.getText()),
                Integer.parseInt(this.audienceField.getText()),
                performersArray,
                this.radioGroupAttire.getSelectedToggle() == this.casualYes );
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

            this.success.setText("Success");
        } catch (Exception e) {
            System.out.print("ERROR");
        }
    }


}
