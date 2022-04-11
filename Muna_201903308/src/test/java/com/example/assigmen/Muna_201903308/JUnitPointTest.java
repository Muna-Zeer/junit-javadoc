package com.example.assigmen.Muna_201903308;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * A JUnit test case class. Every method starting with the word "test" will be
 * called when running the test with JUnit.
 * 
 * @author Muna
 */
public class JUnitPointTest extends TestCase {
	// Attributes

	private double myX;
	private double myY;
	Point p = new Point(2.0, 3.0);

	// Constructors
	/**
	 * Test a Point instance with the given x and y
	 */
	@Test
	public void Point(double x, double y) {
		myX = x;
		myY = y;
	}

	/**
	 * Test a Point instance with default value for myX and myY
	 */
	@Test
	public void Point() {
		myX = 0.;
		myY = 0.;
	}

	// Methods
	/**
	 * Test the x of coordinate for the shape instance
	 */
	@Test
	public double getX() {
		return myX;
	}

	/**
	 * Test the Y of coordinate for the shape instance
	 */
	@Test
	public double getY() {
		return myY;
	}

	/**
	 * Test the Point to the given value of (x,y)
	 */
	@Test
	public void setPoint(double x, double y) {
		myX = x;
		myY = y;
	}

	/**
	 * Test the Point class
	 */
	@Test
	public void test_Point() {
		assertEquals("Point().getX()", 2.0, p.getX());
		assertEquals("Point().getY()", 3.0, p.getY());

	}
}
