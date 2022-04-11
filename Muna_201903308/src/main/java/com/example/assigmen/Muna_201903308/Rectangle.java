package com.example.assigmen.Muna_201903308;


/**
 * Rectangle - defines height and width to specify rectangle
 * 
 * @author Muna
 */
public class Rectangle extends Shape
{
    // Attributes
    private double height;
    private double width;
 
    // Constructors
    /** 
     * Constructs a Rectangle instance with default value for height and width
     */
    public Rectangle()
    {
        super();
        height = 0.0; width = 0.0;
    }
    /**
     *  Constructs a Rectangle instance with the given height and default width
     */
    public Rectangle(Point org, double h, double w){
        super(org);
        height = h; width = w;
    }
 
    /**
     *Returns the area of this Rectangle instance 
     */
    public double area()
    {
        return height * width;
    }
    /**
     *Returns the perimeter of this Rectangle instance 
     */
    public double perimeter()
    {
        return (height + width) * 2;
    }
    /**
     *Returns the H 
     */
    public double getH()
    {
        return height;
    }
    /**
     *Returns the W 
     */
    public double getW()
    {
        return width;
    }
    /**
     *  Sets the HW to the given value of H,W 
     */
    public void setHW(double h, double w)
    {
        height = h; width = w;
    }
}

