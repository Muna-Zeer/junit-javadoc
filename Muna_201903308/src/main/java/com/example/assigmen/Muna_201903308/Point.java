package com.example.assigmen.Muna_201903308;


/**
 * Point - a double x,y coordinate
 * 
 * @author Muna
 */
public class Point         
{
    // Attributes
 
    private double myX;
    private double myY;
 
    // Constructors
    /**
     *  Constructs a Point instance with the given x and  y
     */  
    public Point(double x, double y)
    {
       myX = x; myY = y;
    }
    /** 
     * Constructs a Point instance with default value for myX and myY
     */
    public Point()
    {
       myX = 0.; myY = 0.;
    }
 
    // Methods
    /**
     *Returns the x  of coordinate for the shape instance 
     */
    public double getX()
    {
        return myX;
    }
    /**
     *Returns the Y  of coordinate for the shape instance 
     */
    public double getY()
    {
        return myY;
    }
    /**
     *  Sets the Point  to the given value  of (x,y)
     */
    public void setPoint(double x, double y)
    {
        myX = x; myY = y;
    }
}
