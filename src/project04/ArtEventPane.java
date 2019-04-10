package project04;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;


public class ArtEventPane extends EventPane {

    ArtEventPane() {
    }

    Label type = new Label("Type:");
    TextField typeField = new TextField();

    {
        grid.add(type, 2, 2);
        grid.add(typeField, 3, 2);

    }

    @Override
    public void clearTask() {
        super.clearTask();
        this.typeField.clear();
    }

    @Override
    public void createEvent(){
        new ArtEvent(this.nameField.getText(), this.placeField.getText(), Event.parseDate( ( this.dateField.getText() + this.timeField.getText() ) ), Integer.parseInt(this.audienceField.getText()), typeField.getText() );

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

