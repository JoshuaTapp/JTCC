package chapter08;

import java.util.Scanner;

public class FindAllNearestPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points: ");

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;

        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        int[][] indices = new int[points.length][2];
        int k = 0;
        double distance;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (shortestDistance >= distance) {
                    shortestDistance = distance;
                    indices[k][0] = i;
                    indices[k][1] = j;
                    k++;
                }
            }
        }

        for (int l = 0; l < k; l++) {

            System.out.println("The closest two points are " + "(" + points[indices[l][0]][0] + ", " + points[indices[l][0]][1] +")"
                    + " and " + "(" + points[indices[l][1]][0] + ", " + points[indices[l][1]][1] + ")");
        }
        System.out.println("Their distance is " + shortestDistance);
    }


    static double distance(double x1, double y1, double x2, double y2){

        double x = (x2 - x1) * (x2 - x1);
        double y = (y2 - y1) * (y2 - y1);

        double distance = Math.sqrt(x + y);
        return distance;
    }
}
