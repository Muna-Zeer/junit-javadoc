package com.example.assigmen.Muna_201903308;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * A JUnit test case class. Every method starting with the word "test" will be
 * called when running the test with JUnit.
 * 
 * @author Muna
 */
public class JUnitColorTest extends TestCase {
	// Attributes
	private int blue;
	private int green;
	private int red;
	Color col=new Color();
	

	/**
	 * Test a Color instance with given value for three color
	 */
	@Test
	public void Color(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	

	/**
	 * Test - a simple RGB color representation blue color
	 */
	@Test
	public int getB() {
		return blue;
	}

	/**
	 * Test - a simple RGB color representation green color
	 */
	@Test
	public int getG() {
		return green;
	}

	/**
	 * Test- a simple RGB color representation red color
	 */
	@Test
	public int getR() {
		return red;
	}

	/**
	 * Test the RGB color to the given value r,b,g
	 */
	@Test
	public void setRGB(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}
	
	 /**
	   * Test the Color class
	   */
  @Test
	  public void test_Color() {
	    assertEquals("Color().getR()", red, col.getB());
	    assertEquals("Color().getB()", blue, col.getR());
	    assertEquals("Color().getG()", green, col.getG());
	  }
}
