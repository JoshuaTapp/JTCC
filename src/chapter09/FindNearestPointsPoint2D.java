package chapter09;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;

public class FindNearestPointsPoint2D {

    public static void main(String[] args) {

        //Receive Inputs - N(p) and P[]
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        Point2D[] points = new Point2D[numberOfPoints];

        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {

            points[i] = new Point2D.Double(input.nextDouble(), input.nextDouble());
        }

        // 2D matrix of Distance values between each point
        // Set min value to max double
        // keep track of the min values indices in array

        double min = Double.MAX_VALUE;
        int pointA = 0;
        int pointB = 0;


        //Standard Brute Force Algorithm
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].distance(points[j]) < min) {
                    min = points[i].distance(points[j]);
                    pointA = i;
                    pointB = j;
                }
            }
        }
        //Print results
        System.out.println("The closest two points are " + points[pointA].toString().substring(14) + " and " + points[pointB].toString().substring(14));
    }
}



