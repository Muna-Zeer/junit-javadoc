package com.example.assigmen.Muna_201903308;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;
  

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 * 
 * @author Muna
 */
public class JUnitCircle extends TestCase{
	 
	/**tolerance value for assertEquals using doubles
	 * */
	// Attributes
    private double radius;
	private double _tol = 1e-15;  
	Circle c1 = new Circle();
	
	  /**
     *Test  the area of this Circle instance 
     */@Test
    public double area()
    {
        return Math.PI * radius * radius;  // Pi r Squared
    }
    /**
     *Test  the radius 
     */
    @Test
    public double getRadius()
    {
        return radius;
    }
    /**
     *Test  the perimeter of this Circle instance 
     */
    @Test
    public double perimeter()
    {
        return 2 * Math.PI * radius;    //perimeter = 2 PI r
    }
	
    /**
	   * Test the area of Circle
	   */
	 @Test
	    public void test_Area() {
		 Circle circle = new Circle(new Point(),5.0);

	        assertEquals(Math.PI*25.0, circle.area(),_tol);
	    }
	
	 /**
	   * Test the perimeter of Circle 
	   */
	 @Test
	    public void test_Perimeter() {
		 Circle circle = new Circle(new Point(),0);

	        assertEquals(0, circle.perimeter(),_tol);
	    }
	 /**
	   * Test the negative_values_are_not_allowed in Circle 
	   */
	 @Test(expected = IllegalArgumentException.class)
	    public void negative_values_are_not_allowed() {
	        new Circle(new Point(),-5);
	    }
	 /**
	   * Test the Circle class
	   */
    @Test
	  public void test_Circle() {
	    assertEquals("Circle(5).getArea()", Math.PI*25.0, (new Circle(new Point(), 5)).area(), _tol);
	    assertEquals("Circle(1.3).getArea()", Math.PI*1.69, (new Circle(new Point(), 1.3)).area(), _tol);
	    assertEquals("Circle(0).getArea()", 0, (new Circle(new Point(),0)).area(), _tol);
	  }
    /**
	   * Test the height and width to specify Circle
	   */
	 @Test
	 public void TestCircle()throws IOException{
		 Circle circle = new Circle(new Point(),5);
		 assertEquals(5, circle.getRadius());
		 
		 Circle circle1 = new Circle(new Point(),5);
		 assertEquals(4, circle.getRadius());
		
	    }
	
}
