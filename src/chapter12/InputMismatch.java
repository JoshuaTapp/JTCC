package chapter12;
import java.util.InputMismatchException;
import java.util.Scanner;


public class InputMismatch {

    public static void main(String Arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int sum;
        do {
            try {
                int n1 = Integer.parseInt(sc.next());
                int n2 = Integer.parseInt(sc.next());
                sum = n1 + n2;
                break;

            } catch (Exception e) {
                System.out.print("Incorrect input please re-enter two integers: ");
                sc.next();
            }
        } while (true);

        System.out.println("Sum is " + sum);
    }
}