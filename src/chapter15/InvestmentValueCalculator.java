/*
 * Created on 4/30/19 12:15 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

package chapter15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import javafx.event.ActionEvent;

public class InvestmentValueCalculator extends Application{
    private TextField amount = new TextField();
    private TextField years = new TextField();
    private TextField rate   = new TextField();
    private TextField future = new TextField();
    Button btCalc = new Button("Calculate");
    private Insets padd = new Insets(50);

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane innerpane = new GridPane();
            innerpane.setAlignment(Pos.BOTTOM_RIGHT);
            innerpane.add(btCalc, 0,1);

        GridPane pane = new GridPane();
            pane.setAlignment(Pos.BOTTOM_RIGHT);
            pane.setPadding(padd);

            pane.add(amount, 1, 0);
            pane.add(years, 1, 1);
            pane.add(rate, 1, 2);
            pane.add(future, 1, 3);
            pane.add(new Label("Investment Amount:"), 0, 0);
            pane.add(new Label("Number of Years:"), 0, 1);
            pane.add(new Label("Annual Interest Rate:"), 0, 2);
            pane.add(new Label("Future Value:"), 0, 3);
            pane.add(innerpane, 1, 4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("InvestmentValueCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    //Event Handler
        btCalc.setOnAction((ActionEvent e) -> {
            future.clear();
            calcFuture();
        });

    }

    //Calc Function used in Handler
        private void calcFuture() {

            try {
                double interest = (Double.parseDouble(rate.getText())) / 1200;
                double prins = Double.parseDouble(amount.getText());
                double time = 12 * Double.parseDouble(years.getText());
                double total = prins * (Math.pow((1 + interest), time));
                future.setText(String.format("$%.2f", total));
            } catch(Exception e){
                future.setText("Error");
            }
        }
}


