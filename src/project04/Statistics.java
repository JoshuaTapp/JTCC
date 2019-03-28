package project04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Statistics extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ArtEventPane art = new ArtEventPane();

        Pane pane = art.getArtPane();
        Scene scene = new Scene(pane);
        primaryStage.setTitle("InvestmentValueCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
