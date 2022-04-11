package com.example.assigmen.Muna_201903308;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * A JUnit test case class. Every method starting with the word "test" will be
 * called when running the test with JUnit.
 * 
 * @author Muna
 */
public class JUnitRectangleTest extends TestCase {
	Rectangle r1 = new Rectangle();
	// Attributes
	private double height;
	private double width;

	private double _tol = 1e-15; // tolerance value for assertEquals using doubles

	/**
	 * Test the height and width to specify rectangle
	 */
	@Test
	public void TestRectangle() throws IOException {
		Rectangle r2 = new Rectangle(new Point(), 5, 7);
		assertEquals(5, r2.getW());
		assertEquals(7, r2.getH());
		Rectangle r1 = new Rectangle(new Point(), 1.3, 2.7);
		assertEquals(1.3, r1.getW());
		assertEquals(2.7, r1.getH());
	}

	/**
	 * Test the area of Rectangle
	 */
	@Test
	public double area() {
		return height * width;
	}

	/**
	 * Test the perimeter of Rectangle
	 */
	@Test
	public double perimeter() {
		return 2 * height * width;
	}

	/**
	 * Test the height of Rectangle
	 */
	@Test
	public double getH() {
		return height;
	}

	/**
	 * Test the width of Rectangle
	 */
	@Test
	public double getW() {
		return width;
	}

	/**
	 * Test the area of Rectangle
	 */
	@Test
	public void test_Area() {
		Rectangle rectangle = new Rectangle(new Point(), 7.8, 5.6);

		assertEquals(43.68, rectangle.area());
	}

	/**
	 * Test the perimeter of Rectangle
	 */

	@Test
	public void test_perimeter() {
		Rectangle rectangle = new Rectangle(new Point(), 5, 3);

		assertEquals(16.0, rectangle.perimeter());
	}

	/**
	 * Test the negative_values_are_not_allowed in Rectangle
	 */
	@Test(expected = IllegalArgumentException.class)
	public void negative_values_are_not_allowed() {
		new Rectangle(new Point(), -5, 3);
	}

	/**
	 * Test the Rectangle class
	 */
	public void test_Rectangle() throws IOException {
		assertEquals("Rectangle(5, 7).getArea()", 35.0, (new Rectangle(new Point(), 5, 7)).area(), _tol);
		assertEquals("Rectangle(1.3, 2.7).getArea()", 3.51, (new Rectangle(new Point(), 1.3, 2.7)).area(),
				_tol);
		assertEquals("Rectangle(0, 0).getArea()", 0, (new Rectangle(new Point(), 0, 0)).area(), _tol);
		assertEquals("Rectangle(0, Math.PI).getArea()", 0, (new Rectangle(new Point(), 0, Math.PI)).area(),
				_tol);
		assertEquals("Rectangle(Math.PI, 0).getArea()", 0, (new Rectangle(new Point(), Math.PI, 0)).area(),
				_tol);

	}

}
