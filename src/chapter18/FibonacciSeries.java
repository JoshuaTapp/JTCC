package chapter18;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import myLibrary.Stopwatch;


public class FibonacciSeries {
    private static Map<Integer, BigInteger> fibMap = new HashMap<>();
    private static Integer betterCounter = 0;
    private static Integer worseCounter = 0;

    public static void main(String[] args) {
        fibMap.put(0, BigInteger.valueOf(0));
        fibMap.put(1, BigInteger.valueOf(1));
        Stopwatch fibTimer = new Stopwatch();
        Stopwatch betterFibTimer = new Stopwatch();

        Integer index;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index");
        index = sc.nextInt();

        BigInteger betterAnswer;
        long worseAnswer;

        betterFibTimer.start();
        betterAnswer = betterFibSeries(index);
        betterFibTimer.end();

        fibTimer.start();
        worseAnswer = fib(index);
        fibTimer.end();

        System.out.println("Top Down Method (Assigned Problem)\n" + "Fibonacci number at index 50 is: " + worseAnswer + "\n" + "Number of times fib is invoked? " + worseCounter +"\nTime to compute: " + fibTimer.toString() + " seconds");
        System.out.println();
        System.out.println("Bottom Up Method (Improved Version)\n" + "Fibonacci number at index 50 is: " + betterAnswer + "\n" + "Number of times betterFib is invoked? " + betterCounter + "\nTime to compute: " + betterFibTimer.toString() + " seconds");
    }


     private static BigInteger betterFibSeries(Integer i) {
        BigInteger temp;
        betterCounter++;

        if (i.equals(0)) {
            return fibMap.get(0);
        } else if (i.equals(1)) {
            return fibMap.get(1);
        } else {
            temp = fibMap.get(i);
            if (temp == null) {
                temp = (betterFibSeries(i - 1).add(betterFibSeries(i - 2)));
                fibMap.put(i, temp);
            }
        }
        return temp;
    }

     private static long fib(Integer i) {
        worseCounter++;

        if (i.equals(0)) {
            return 0;
        } else if (i.equals(1)) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }

}
