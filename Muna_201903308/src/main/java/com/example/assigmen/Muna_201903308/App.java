package com.example.assigmen.Muna_201903308;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Test Constructors and toString()
		Shape s=new Circle();
		Shape s1=new Rectangle();
		Circle c1 = new Circle((new Point()), 5);
		System.out.println(c1); // toString()
		Circle c2 = new Circle(); // default constructor
		System.out.println(c2);
		 // Attributes
	    int blue;
	     int green;
	    int red;
	

		// Test setter and getter
		c1.setRadius(1);
		System.out.println(c1); // toString()
		System.out.println("radius is: " + c1.getRadius());

		// Test getArea() and perimeter()
		System.out.printf("area is: %.2f%n", c1.area());
		System.out.printf("perimeter is: %.2f%n", c1.perimeter());
		
		/**
		 *Test Constructors Rectangle **/
		  Rectangle r1 = new Rectangle( new Point(),1.2, 3.4);
	      System.out.println(r1);  // toString()
	      Rectangle r2 = new Rectangle();  // default constructor
	      System.out.println(r2);

	      // Test setters and getters
	     
	      r1.setHW(7.8,5.6);
	      
	      System.out.println(r1);  // toString()
	      System.out.println("\nlength is: " + r1.getH());
	      System.out.println("width is: " + r1.getW());

	      
	      // Test getArea() and getPerimeter()
	      System.out.printf("area is: %.2f%n", r1.area());
	      System.out.printf("perimeter is: %.2f%n", r1.perimeter());
	}
}
