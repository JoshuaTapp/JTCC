package chapter16;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class InvestmentValueCalculatorPane {

    private TextField amount = new TextField();
    private TextField years = new TextField();
    private TextField rate = new TextField();
    private TextField future = new TextField();
    Button btCalc = new Button("Calculate");
    Button clear = new Button("Clear");

    private Pane pane;

    InvestmentValueCalculatorPane() {
    }

    {
        GridPane inner = new GridPane();
        inner.setAlignment(Pos.BOTTOM_RIGHT);
        inner.setPadding(new Insets(50));

        inner.add(amount, 1, 0);
        inner.add(years, 1, 1);
        inner.add(rate, 1, 2);
        inner.add(future, 1, 3);
        inner.add(btCalc, 1, 4);
        inner.add(new Label("Investment Amount:"), 0, 0);
        inner.add(new Label("Number of Years:"), 0, 1);
        inner.add(new Label("Annual Interest Rate:"), 0, 2);
        inner.add(new Label("Future Value:"), 0, 3);
        inner.add(clear, 0, 4);

        pane = inner;

        //Event Handler
        btCalc.setOnAction((ActionEvent e) -> {
            future.clear();
            calculateFutureValue();
        });
        //Event Handler
        clear.setOnAction((ActionEvent e) -> {
            amount.clear();
            years.clear();
            rate.clear();
            future.clear();
        });
    }

    public Pane getPane() {
        return pane;
    }


    //Calc Function used in Handler
        private void calculateFutureValue(){
            try {
                double interest = (Double.parseDouble(rate.getText())) / 1200;
                double prins = Double.parseDouble(amount.getText());
                double time = 12 * Double.parseDouble(years.getText());
                double total = prins * (Math.pow((1 + interest), time));
                future.setText(String.format("$%.2f", total));
            }catch (Exception e) {
                future.setText("Error");
            }
        }
}
