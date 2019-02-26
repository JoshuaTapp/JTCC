package chapter13;

import java.lang.annotation.Inherited;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(double a, double b, double c){
        this.setSide1(a);
        this.setSide2(b);
        this.setSide3(c);
    }
    public Triangle(){
    }

    @Override
    public double getArea(){
       double s = this.getPerimeter() / 2;
       double a = Math.sqrt( s * (s - this.getSide1() ) * (s - this.getSide2() ) * (s - this.getSide3()));

       return a;
    }
    @Override
    public double getPerimeter(){
        double s = this.getSide1() + this.getSide2() + this.getSide3();
        return s;
    }
    @Override
    public String toString() {
        String str = "Triangle: side1 = " + this.getSide1() + ", side2 = " + this.getSide2() + ", side3 = " + this.getSide3() ;
        return str;
    }
}
