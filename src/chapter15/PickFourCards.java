package chapter15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import javafx.event.ActionEvent;

public class PickFourCards extends Application {

    ArrayList<Integer> list = createArrayList();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btRF = new Button("Refresh");
        GridPane grid = new GridPane();
        Insets pad = new Insets(50);
        grid.setPadding(pad);

        HBox box = new HBox(4);
        HBox box2 = new HBox (1);


        box.setAlignment(Pos.TOP_CENTER);
        box2.setAlignment(Pos.BOTTOM_CENTER);


        box.getChildren().add(0, new ImageView("/chapter14/card/" + list.get(0) + ".png"));
        box.getChildren().add(1, new ImageView("/chapter14/card/" + list.get(1) + ".png"));
        box.getChildren().add(2, new ImageView("/chapter14/card/" + list.get(2) + ".png"));
        box.getChildren().add(3, new ImageView("/chapter14/card/" + list.get(3) + ".png"));


        box2.getChildren().add(btRF);


        grid.add(box, 0, 0);
        box2.setPadding(pad);
        grid.add(box2, 0, 2);


        Scene scene = new Scene(grid);
        primaryStage.setTitle("PickFourCards");
        primaryStage.setScene(scene);
        primaryStage.show();

        btRF.setOnAction((ActionEvent e) -> {
            Collections.shuffle(list);
            box.getChildren().set(0, new ImageView("/chapter14/card/" + list.get(0) + ".png"));
            box.getChildren().set(1, new ImageView("/chapter14/card/" + list.get(1) + ".png"));
            box.getChildren().set(2, new ImageView("/chapter14/card/" + list.get(2) + ".png"));
            box.getChildren().set(3, new ImageView("/chapter14/card/" + list.get(3) + ".png"));
        });
    }
        public ArrayList createArrayList() {
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i < 53; i++) {
                list.add(i);
                //System.out.print(" " + list.get(i - 1));
            }
            return list;
        }
    }

