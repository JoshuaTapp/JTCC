package chapter14;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class DisplayFourFlags extends Application {

    public static void main(String[] args) {Application.launch(args);}

        @Override
        public void start (Stage primaryStage){

            ImageView imageView1 = new ImageView("chapter14/image/us.gif");
            ImageView imageView2 = new ImageView("chapter14/image/ca.gif");
            ImageView imageView3 = new ImageView("chapter14/image/fr.gif");
            ImageView imageView4 = new ImageView("chapter14/image/uk.gif");

            GridPane pane = new GridPane();
            pane.setAlignment(Pos.CENTER);

            pane.add(imageView1,0,0);
            pane.add(imageView2,1,0);
            pane.add(imageView3,0,1);
            pane.add(imageView4,1,1);

            Scene scene = new Scene(pane);
            primaryStage.setTitle("Four Flags");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }



