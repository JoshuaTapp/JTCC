package myLibrary;

import java.util.Scanner;

//Function to grab user input and return type required.
public class getInput {

    // grab() captures next input in Scanner. Test if double and either asks for another try or returns double entered.

    public static double createDouble() {
        Scanner kb = new Scanner(System.in);
        double input;
        do
            try {
                System.out.println("Please input a number =< ");
                input = kb.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Please Try Again. Make sure to use a real number.");
                kb.next();
            } while (true);
        return input;
    }

    public static int createInt() {
        //Simple class to fetch user input and return Integer
        //Has simple loop to handle error catching and prevent non-integer inputs.
        int input;
        Scanner kb = new Scanner(System.in);
            do {
                try {
                    System.out.println("Please input an Integer => ");
                    input = kb.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Please Try Again. Make sure to use an Integer.");
                    kb.next();
                }
            } while (true);
        return input;
    }
}

