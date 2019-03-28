package project04;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.time.LocalDate;


public class ArtEventPane {

    ArtEventPane(){
    }

    private Pane ArtPane;

    private Label name = new Label("Name:");
    private Label eventDate = new Label("Date (mm/dd/yyyy):");
    private Label audience = new Label("Audience:");
    private Label place = new Label("Place:");
    private Label time = new Label ("Time (hh:mm):");
    private Label type = new Label("Type:");
    private Label isWeekemd = new Label("Weekend:");

    private Button clear = new Button("Clear");
    private Button submit = new Button("Submit");

    private TextField nameField = new TextField();
    private TextField dateField = new TextField();
    private TextField audienceField = new TextField();
    private TextField placeField = new TextField();
    private TextField timeField = new TextField();
    private TextField typeField = new TextField();
    private RadioButton weekendYes = new RadioButton("YES");
    private RadioButton weekendNo = new RadioButton("NO");
    private final ToggleGroup radioGroup = new ToggleGroup();
    private GridPane grid = new GridPane();
    private HBox radioGroupPane = new HBox();

    {
        // Setup ToggleGroup & disable buttons from user
        weekendYes.setToggleGroup(radioGroup);
        weekendNo.setToggleGroup(radioGroup);
        weekendYes.setDisable(true);
        weekendNo.setDisable(true);
        weekendNo.setOpacity(100);
        weekendYes.setOpacity(100);

        radioGroupPane.getChildren().addAll(weekendYes, weekendNo);
        radioGroupPane.setSpacing(25);
        // NON-USER Interface
        grid.add(name, 0, 0 );
        grid.add(eventDate, 0, 1 );
        grid.add(audience, 0, 2 );
        grid.add(clear, 0, 3 );
        grid.add(isWeekemd, 0, 4);
        grid.add(place, 2, 0 );
        grid.add(time, 2, 1 );
        grid.add(type, 2, 2 );
        grid.add(submit, 2, 3 );

        // USER EDITABLE
        grid.add(nameField, 1, 0 );
        grid.add(dateField, 1, 1 );
        grid.add(audienceField, 1, 2 );
        grid.add(radioGroupPane, 1, 4 );
        grid.add(placeField, 3 , 0);
        grid.add(timeField, 3 , 1);
        grid.add(typeField, 3 , 2);

        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25));
        ArtPane = grid;


        // EVENT HANDLERS
        submit.setOnAction((ActionEvent e) -> {
//            LocalDate temp = Event.parseDate(dateField.toString());
          //  String str = Week.isWeekEnd(temp);

            //ArtEvent aE = new ArtEvent(nameField.toString(), placeField.toString() ,
          //          Event.parseDate(dateField.toString()) , Integer.parseInt(audienceField.toString()), typeField.toString() );

            if (true) {
                select(weekendYes);
            } else {
                select(weekendNo);
            }


        });
    }


    private static void select(RadioButton bt){
        bt.setSelected(true);
    }

    public Pane getArtPane() {
        return ArtPane;
    }
}
