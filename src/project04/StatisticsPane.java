package project04;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class StatisticsPane extends Pane{
    private Pane StatisticsPane;
    private GridPane gridPane = new GridPane();

    StatisticsPane(){}

    private TextField events = new TextField();
    private TextField sportsEvent = new TextField();
    private TextField soccerEvent = new TextField();
    private TextField concertEvent = new TextField();
    private TextField musicEvent = new TextField();
    private TextField basketballEvent = new TextField();
    private TextField orchestraEvent = new TextField();
    private TextField artEvent = new TextField();

    private TextArea printArea = new TextArea();

    private Button count = new Button("Count");
    private Button clear = new Button("Clear");

    {
        printArea.setEditable(false);
        printArea.setWrapText(true);
        printArea.setFont(new Font("Times New Roman",12));
        printArea.setPrefSize(750,200);
        gridPane.add(printArea,0,6,6,6);

        gridPane.setAlignment(Pos.TOP_LEFT);

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(events,1,0);
        gridPane.add(sportsEvent,1,1);
        gridPane.add(soccerEvent,1,2);
        gridPane.add(concertEvent,1,3);
        gridPane.add(clear,0,4);

        gridPane.add(musicEvent,3,1);
        gridPane.add(basketballEvent,3,2);
        gridPane.add(orchestraEvent,3,3);
        gridPane.add(count,2,4);

        gridPane.add(artEvent,5,1);

        gridPane.add(new Label("Events:"),0,0);
        gridPane.add(new Label("Sport Events:"),0,1);
        gridPane.add(new Label("Soccer Games:"),0,2);
        gridPane.add(new Label("Concerts:"),0,3);
        gridPane.add(new Label("Music Events:"),2,1);
        gridPane.add(new Label("Basketball Games:"),2,2);
        gridPane.add(new Label("Orchestras:"),2,3);
        gridPane.add(new Label("Art Events:"),4,1);

        events.setAlignment(Pos.BOTTOM_RIGHT);
        sportsEvent.setAlignment(Pos.BOTTOM_RIGHT);
        soccerEvent.setAlignment(Pos.BOTTOM_RIGHT);
        concertEvent.setAlignment(Pos.BOTTOM_RIGHT);
        musicEvent.setAlignment(Pos.BOTTOM_RIGHT);
        basketballEvent.setAlignment(Pos.BOTTOM_RIGHT);
        orchestraEvent.setAlignment(Pos.BOTTOM_RIGHT);
        artEvent.setAlignment(Pos.BOTTOM_RIGHT);

        StatisticsPane = gridPane;

        count.setOnAction((ActionEvent e)->{
            printArea.setText(Event.getEventList().toString() + printEvents());
            this.events.setText(String.valueOf(Event.getNumberOfObjects() ) );
            this.sportsEvent.setText(String.valueOf(SportEvent.getNumberOfObjects() ) );
            this.soccerEvent.setText(String.valueOf(SoccerGame.getNumberOfObjects() ) );
            this.concertEvent.setText(String.valueOf(Concert.getNumberOfObjects() ) );
            this.musicEvent.setText(String.valueOf(MusicEvent.getNumberOfObjects() ) );
            this.basketballEvent.setText(String.valueOf(BasketBallGame.getNumberOfObjects() ) );
            this.orchestraEvent.setText(String.valueOf(Orchestra.getNumberOfObjects() ) );
            this.artEvent.setText(String.valueOf(ArtEvent.getNumberOfObjects() ) );

        });

        clear.setOnAction((ActionEvent e)->{
            events.clear();
            sportsEvent.clear();
            soccerEvent.clear();
            concertEvent.clear();
            musicEvent.clear();
            basketballEvent.clear();
            orchestraEvent.clear();
            artEvent.clear();
        });
    }

    public static void getNumberOfObjects() {
        System.out.println("Events: "           + Event.getNumberOfObjects());
        System.out.println("Sport Events: "     + SportEvent.getNumberOfObjects());
        System.out.println("Music Events: "     + MusicEvent.getNumberOfObjects());
        System.out.println("Art Events: "       + ArtEvent.getNumberOfObjects());
        System.out.println("Soccer Games: "     + SoccerGame.getNumberOfObjects());
        System.out.println("Basketball Games: " + BasketBallGame.getNumberOfObjects());
        System.out.println("Concerts: "         + Concert.getNumberOfObjects());
        System.out.println("Orchestras: "       + Orchestra.getNumberOfObjects());
    }  // getNumberOfObjects()

    public String printEvents(){
        String temp = "\n";
        for (int i = 0; i < Event.getEventList().size() - 1 ; i++) {
            temp += ("Event " + i + ": Class: "  + Event.getEventList().get(i).getClass().getSimpleName() + ",\t"  + "Event Name: " + Event.getEventList().get(i).getName() + "\n");
        }
        return temp;
    }

    Pane getPane(){return StatisticsPane;}
}