package chapter16;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;


public class CalculatorGUI extends Application {
    private String[] programTitles  = { "Loan Calculator", "Investment Value Calculator", "Close" };
    private Pane[] programPanes = { new LoanCalculatorPane().getLoanCalculatorPane(), new InvestmentValueCalculatorPane().getPane() };


    @Override
    public void start(Stage primaryStage) {

        ListView<String> listView = new ListView<>(FXCollections.observableArrayList(programTitles));
        listView.setPrefSize(200, 200);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        StackPane stack = new StackPane();
        ScrollPane scroll = new ScrollPane(listView);
        scroll.fitToWidthProperty();
        scroll.fitToHeightProperty();

        HBox mainPane = new HBox();
        mainPane.getChildren().addAll(scroll, stack);


        Scene scene = new Scene(mainPane, 600, 250);
        primaryStage.setTitle("InvestmentValueCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Event Handler
        listView.getSelectionModel().getSelectedIndices().addListener(
                (ListChangeListener<? super Integer>) e1 -> {
                    stack.getChildren().removeAll(programPanes);

                    if(listView.getSelectionModel().getSelectedItem().equals("Loan Calculator")){
                        stack.getChildren().add(programPanes[0]);
                    }
                    else if(listView.getSelectionModel().getSelectedItem().equals("Investment Value Calculator")){
                        stack.getChildren().add(programPanes[1]);
                    }
                    else { System.exit(0); }
                }
        );

  }
}
