package com.example.assigmen.Muna_201903308;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * A JUnit test case class. Every method starting with the word "test" will be
 * called when running the test with JUnit.
 * 
 * @author Muna
 */
public class JUnitShapeTest extends TestCase {
	private double _tol = 1e-15; // tolerance value for assertEquals using doubles
	Point p1=new Point(0,4);
	Point p=new Point(0,0);
	Color color = new Color();

	/**
	 * Test the Point class
	 */
	@Test
	public void test_Point()  throws IOException {
		
		Point r1 = new Point( 1.3, 2.7);
		assertEquals(1.3, r1.getX());
		assertEquals(2.7, r1.getY());
	}


	
	/**
	 * Test the Circle class
	 */
	@Test
	public void test_Circle() throws Exception {
		assertEquals("Circle(5).getArea()", Math.PI * 25.0, (new Circle(new Point(), 5)).area(), _tol);
		assertEquals("Circle(1.3).getArea()", Math.PI * 1.69, (new Circle(new Point(), 1.3)).area(), _tol);
		assertEquals("Circle(0).getArea()", 0, (new Circle(new Point(), 0)).area(), _tol);
	}

	/**
	 * Test the Rectangle class
	 * 
	 */
	@Test
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

	/**
	 * Test the Color of simple RGB color representation G/B/R
	 */
	@Test
	protected void Shape(Color color) {
		color = new Color(color.getR(), color.getG(), color.getB());

		assertEquals("color is", 0, (new Color().getG()), color.getB());
		assertEquals("color is", 0, (new Color().getG()), color.getG());

	}

	/**
	 * Test the Color of simple RGB color representation G/B/R
	 */
	@Test
	public Color getColor() {

		return color;
	}

	/**
	 * Test the origin
	 */
	@Test
	public void setOrigin(Point org) {
		p.setPoint(org.getX(), org.getY());
	
		assertEquals("origion of x is", 0, p.getX());
		assertEquals("origion of Y", 0, p.getY());

	
	}
	/**
	 * Test the Shape abstract
	 */
	@Test
	public void test_IShape() {
		Shape s; // s is an abstract shape

		/**
		 * s refers to a circle now
		 */
		s = new Circle(new Point(), 5);
		assertEquals("Circle(5): IShape.area()", Math.PI * 25.0, s.area(), _tol);

		s = new Rectangle(new Point(), 5, 7); // s refers to a rectangle now
		assertEquals("Rectangle(5, 7): IShape.rea()", 35.0, s.area(), _tol);

	}
	
}