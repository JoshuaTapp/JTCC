package project04;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestEventGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    String[] eventTitles = {"Soccer Game", "Basketball Game", "Concert", "Orchestra", "Art Event", "Statistics", "Close"};
    Pane[] programPanes = {
            new SoccerGamePane().getPane(),
            new BasketballGamePane().getPane(),
            new ConcertPane().getPane(),
            new OrchestraPane().getPane(),
            new ArtEventPane().getPane(),
            new StatisticsPane().getPane(),
    };

    @Override
    public void start(Stage primaryStage) {

        ListView<String> listView = new ListView<>(FXCollections.observableArrayList(eventTitles));
        listView.setPrefSize(200, 450);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        StackPane stack = new StackPane();
        ScrollPane scroll = new ScrollPane(listView);

        listView.setPadding(new Insets(0,0,0,0));
        HBox pane = new HBox();
        pane.getChildren().addAll(scroll, stack);


        Scene scene = new Scene(pane,1050,400);
        primaryStage.setTitle("TestEventGUI");
        primaryStage.setScene(scene);
        primaryStage.show();

        listView.getSelectionModel().getSelectedIndices().addListener(
                (ListChangeListener<? super Integer>) e -> {
                    stack.getChildren().removeAll(programPanes);

                    for (int i = 0; i < eventTitles.length - 1; i++) {

                        if (listView.getSelectionModel().isSelected(i)) {
                            stack.getChildren().add(programPanes[i]);
                        } else if (listView.getSelectionModel().getSelectedIndex() == 6) {
                            System.exit(0);
                        }
                    }
                }
        );
    }

}
