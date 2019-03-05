package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class DisplayFourFlags extends Application {

    public static void main(String[] args) {Application.launch(args);}

        @Override
        public void start (Stage primaryStage){

            ImageView imageView1 = new ImageView("image/us.gif");


            StackPane pane = new StackPane();
            Scene scene = new Scene(pane, 600, 400);
            primaryStage.setTitle("Four Flags");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }



