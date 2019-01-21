package chapter06;

import myLibrary.getInput;

public class SortThreeNumbers {

    public static void main(String arg[]){

        double num1 = getInput.createDouble();
        double num2 = getInput.createDouble();
        double num3 = getInput.createDouble();

        displaySortedNumbers(num1, num2, num3);
}

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        //Input expects 3 legal double.
        //Prints out the 3 doubles in ascending order
        System.out.println("");


        if(num1 <= num2 && num1 <= num3){
            //Will print if num1 is largest.
            System.out.print(num1 + " ");
            if(num2 <= num3){
                System.out.print(num2 + " " + num3);
            }
            else {
                System.out.print(num3 + " " + num2);
            }
        }

        else if(num2 < num1 && num2 <= num3){
            //Will print if num2 is largest.
            System.out.print(num2 + " ");
            if(num1 <= num3){
                System.out.print(num1 + " " + num3);
            }
            else {
                System.out.print(num3 + " " + num1);
            }
        }

        else{
            //Will print if num3 is largest.
            System.out.print(num3 + " ");
            if(num1<=num2){
                System.out.print(num1 + " " + num2);
            }
            else{
                System.out.print(num2 + " " + num1);
            }
        }
    }




}
