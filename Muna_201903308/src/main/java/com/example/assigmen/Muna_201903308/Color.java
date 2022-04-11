package com.example.assigmen.Muna_201903308;



/**
 * Color - a simple RGB color representation
 * 
 * @author Muna
 */
public class Color         
{
    // Attributes
    private int blue;
    private int green;
    private int red;
 
    /**
     *  Constructs a Color instance with given value for three color
     */
    public Color(int r, int g, int b)
    {
        red = r; green = g; blue = b;
    }
    /** 
     * Constructs a color instance with default value for three color
     */
    public Color() {
		super();
	}

	/**
     * Returns - a simple RGB color representation blue color
     */
    public int getB()
    {
        return blue;
    }
    /**
     * Returns - a simple RGB color representation green color
     */
    public int getG()
    {
        return green;
    }
    /**
     * Returns- a simple RGB color representation red color
     */
    public int getR()
    {
        return red;
    }
    /**
     *  Sets the RGB color to the given value r,b,g
     */
    public void setRGB(int r, int g, int b)
    {
        red = r; green = g; blue = b;
    }
}

