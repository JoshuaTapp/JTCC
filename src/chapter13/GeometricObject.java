package chapter13;

import java.lang.String;
import java.util.Date;

public abstract class GeometricObject {

    private final Date dateCreated = new Date();

    protected GeometricObject() {}

    public Date getDateCreated() {return this.dateCreated;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "created on " + this.getDateCreated();}

    //Inherit Area method
    public abstract double getArea();
    //Inherit Perimeter method
    public abstract double getPerimeter();

}  // abstract class GeometricObject