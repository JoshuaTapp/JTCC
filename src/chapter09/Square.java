package chapter09;

public class Square {

//Variables

    //Static Variables
    private static int NumberOfObjects = 0;

    //Instance Variables
    private double side;
    private double area;

//Methods

    //Getters and Setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int objectNumber) {
        NumberOfObjects = objectNumber;
    }

    //Constructors
    public Square(){
        this.setSide(1);
        this.setArea(1);
        this.setNumberOfObjects(getNumberOfObjects() + 1);
    }

    public Square(double edge) {
        this.setSide(edge);
        this.setArea(side * side);
        this.setNumberOfObjects(getNumberOfObjects()+ 1 );
    }
}
