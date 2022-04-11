package com.example.assigmen.Muna_201903308;

/**
 * Circle - a Shape representing a circle
 * 
 * @author Muna
 */
import java.lang.Math;        // for value of  PI
 
public class Circle extends Shape{
    // Attributes
    private double radius;
 
    /** 
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle()
    {
        super();
        radius = 0.0;
    }
    /**
     *  Constructs a Circle instance with the given radius and default color
     */

    public Circle(final Point org, final double rad)
    {
    	 super(org);
        radius = rad;
    }
 
    /**
     *Returns the area of this Circle instance 
     */
    public double area()
    {
        return Math.PI * radius * radius;  // Pi r Squared
    }
    /**
     *Returns the radius 
     */
    public double getRadius()
    {
        return radius;
    }
    /**
     *Returns the perimeter of this Circle instance 
     */
    public double perimeter()
    {
        return 2 * Math.PI * radius;    //perimeter = 2 PI r
    }
 
    /**
     *  Sets the radius to the given value 
     */
    public void setRadius(double r)
    {
        radius = r;
    }
}