package com.example.assigmen.Muna_201903308;


/**
 * Shape - an abstract base class for other shapes. Defines color and origin of
 * shape, and getter/setters for those Defines abstract methods area and
 * perimeter for actual shapes (Circle and Rectangle)
 * 
 * 
 * @author Muna
 */
public abstract class Shape {
	// Attributes
	private Color color;
	private Point origin;

	/**
	 * Constructs a Shape instance with the given origin and color
	 */
	protected Shape(Color col, Point org) {
		origin = new Point(org.getX(), org.getY());
		color = new Color(col.getR(), col.getG(), col.getB());
	}

	/**
	 * Constructs a Shape instance with the given origin Point
	 */
	protected Shape(Point org) {
		origin = new Point(org.getX(), org.getY());
		color = new Color(0, 0, 0); // black by default
	}
	/**
	 * Constructs a Shape instance with the given and color
	 */
	protected Shape(Color col) {
		color = new Color(col.getR(), col.getG(), col.getB());
	}

	/**
	 * Constructs a Shape instance with default value for origin and color
	 */
	protected Shape() {
		origin = new Point(0.0, 0.0); // 0.,0. origin
		color = new Color(0, 0, 0); // black by default for shape
	}

	// abstract Methods area,perimeter
	/**abstract Methods area and real shape defines
	 */
	public abstract double area(); // real shape defines
	/**abstract Methods perimeter and real shape defines
	 */
	public abstract double perimeter(); // real shape defines

	/**
	 * Returns the Color of simple RGB color representation G/B/R
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the Color to the given value green or red or blue
	 */
	public void setColor(Color col) {
		color.setRGB(col.getR(), col.getG(), col.getB());
	}

	/**
	 * Returns the origin
	 */
	public Point getOrigin() {
		return origin;
	}

	/**
	 * Sets the Point to the given value of x,Y
	 */
	public void setOrigin(Point org) {
		origin.setPoint(org.getX(), org.getY());
	}
}