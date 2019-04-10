package chapter20;

import javafx.geometry.Point2D;
import java.util.Arrays;
import java.util.Comparator;

public class SortPoints {

    public static void main(String[] args){

        Point2D[] points = new Point2D[5];
        System.out.println("5 Points (X, Y):");

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D(Math.random()*100, Math.random()*100);
            System.out.printf("%2.2f,\t%2.2f\n", points[i].getX(), points[i].getY() );
        }

        System.out.println("\n5 Points sorted by Y and X:");
        Arrays.sort(points, Comparator.comparing(Point2D::getY).thenComparing(Point2D::getX));
        for (Point2D p:
             points) {
            System.out.printf("%2.2f,\t%2.2f\n", p.getX(), p.getY() );
        }

    }


}
