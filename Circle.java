package AlgoEff;

public class Circle {
	int x;
	public Circle(int x) {
		this.x = x;
	}
	
	public String toString() {
		return "Radius: " + x;
	}
}

//public class Circle extends GeometricObject {
//	private double radius;
//
//	public Circle() {
//	}
//
//	public Circle(double radius) {
//		this.radius = radius;
//	}
//
//	public Circle(double radius, String color, boolean filled) {
//		this.radius = radius;
//		setColor(color);
//		setFilled(filled);
//	}
//
//	public double getRadius() {
//		return radius;
//	}
//
//	/** Set a new radius */
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//
//	/** Return area */
//	public double getArea() {
//		return radius*radius*Math.PI;
//	}
//
//	/** Return diameter */
//	public double getDiameter() {
//		return radius*2;
//	}
//	
////
////	/** Return perimeter */
//	public double getPerimeter() {
//		return radius*2*Math.PI;
//	}
//
//	public void printCircle() {
//		System.out.println("The circle is created" + getDateCreated() + " and the radius is: " + getRadius());
//	}
//
//	public String toString() {
//		// return super.toString() + "\nradius is " + radius;
//		return "Area = " + getArea();
//	}
//}