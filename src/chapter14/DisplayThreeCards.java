package chapter14;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DisplayThreeCards extends Application{

    public static void main(String[] args) {Application.launch(args);}

    @Override
    public void start(Stage primaryStage) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 53 ; i++) {
            list.add(i);
            //System.out.print(" " + list.get(i - 1));
        }

        Collections.shuffle(list);

        HBox box = new HBox(3);
        box.getChildren().add(new ImageView("/chapter14/card/" + list.get(0) + ".png"));
        box.getChildren().add(new ImageView("/chapter14/card/" + list.get(1) + ".png"));
        box.getChildren().add(new ImageView("/chapter14/card/" + list.get(2) + ".png"));

        Scene scene = new Scene(box);
        primaryStage.setTitle("Display Three Cards");
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
