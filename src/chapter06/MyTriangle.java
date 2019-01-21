package chapter06;

import myLibrary.getInput;

public class MyTriangle {

    public static void main(String args[]) {
        double edge1 = getInput.createDouble();
        double edge2 = getInput.createDouble();
        double edge3 = getInput.createDouble();

        if (isValid(edge1, edge2, edge3)) {
            System.out.printf("\nThe area of the triangle is %.2f.\n" , computeArea(edge1, edge2, edge3));
        }
        else {
            System.out.println("The input is Invalid.");
        }
    }

    static boolean isValid(double e1, double e2, double e3){
        boolean state = false;
        if(e1 + e2 > e3){
            if(e2 + e3 > e1){
                if(e1 + e3 > e2){
                    state = true;
                }
            }
        }
        return state;
    }

    static double computeArea(double e1, double e2, double e3){
        double s = ((e1 + e2 + e3) / 2);

        double area = Math.sqrt(((s*(s-e1))*(s-e2))*(s-e3));
        return area;
    }
}

