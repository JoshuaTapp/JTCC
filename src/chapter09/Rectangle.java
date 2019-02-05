package chapter09;

public class Rectangle {

    //Variables

    //Static Variables
    private static int NumberOfObjects;

    //Instance Variables
    private double width;
    private double height;
    private double area;

//Methods

    //Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
        Rectangle.setNumberOfObjects(getNumberOfObjects() + 1);
    }

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
        this.area = 1.0;
        Rectangle.setNumberOfObjects(getNumberOfObjects() + 1);
    }
}
