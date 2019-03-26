package chapter16;
import chapter16.LoanCalculator;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoanCalculatorPane {
    private TextField annualInterestRate = new TextField();
    private TextField numberOfYears = new TextField();
    private TextField loanAmount = new TextField();
    private TextField monthlyPayment = new TextField();
    private TextField totalPayment = new TextField();
    private Pane LoanCalculatorPane;

    Button btCalc = new Button("Calculate");
    Button clear = new Button("Clear");

    LoanCalculatorPane() {
    }

    {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.BOTTOM_RIGHT);
        pane.setPadding(new Insets(50));

        pane.add(annualInterestRate, 1, 0);
        pane.add(numberOfYears, 1, 1);
        pane.add(loanAmount, 1, 2);
        pane.add(monthlyPayment, 1, 3);
        pane.add(totalPayment, 1, 4);
        pane.add(btCalc, 1, 5);
        pane.add(new Label("Annual Interest Rate:"), 0, 0);
        pane.add(new Label("Number of Years:"), 0, 1);
        pane.add(new Label("Loan Amount:"), 0, 2);
        pane.add(new Label("Monthly Payment:"), 0, 3);
        pane.add(new Label("Total Payment:"), 0, 4);
        pane.add(clear, 0, 5);

        LoanCalculatorPane = pane;
        //Event Handler
        btCalc.setOnAction((ActionEvent e) ->
                calculatePayments());

        clear.setOnAction((ActionEvent e) -> {
            annualInterestRate.clear();
            numberOfYears.clear();
            loanAmount.clear();
            monthlyPayment.clear();
            totalPayment.clear();
        });
    }


    public Pane getLoanCalculatorPane() {
        return LoanCalculatorPane;
    }

    public void setLoanCalculatorPane(Pane loanCalculatorPane) {
        LoanCalculatorPane = loanCalculatorPane;
    }

    //Calc Function used in Handler
    private void calculatePayments() {

        double rate = (Double.parseDouble(annualInterestRate.getText()));
        double amount = Double.parseDouble(loanAmount.getText());
        double year = Double.parseDouble(numberOfYears.getText());

        LoanCalculatorPane.Loan loan = new Loan(rate, amount, year);

        monthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        totalPayment.setText(String.format("$%.2f", loan.yearlyPayment()));
    }

    class Loan{
        private double interestRate;
        private double loanAmount;
        private double year;

        Loan(double interestRate, double loanAmount, double year){
            this.interestRate = interestRate / 1200;
            this.loanAmount = loanAmount;
            this.year = year;
        }

        public double getMonthlyPayment(){
            return (loanAmount * interestRate / (1 - (1 / Math.pow(1 + interestRate , year * 12))));
        }

        public double yearlyPayment(){

            return (getMonthlyPayment() * year * 12) ;
        }
    }
}


