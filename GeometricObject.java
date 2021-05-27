package AlgoEff;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	protected String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public abstract double getArea();
	public abstract double getPerimeter();
	
	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public int compareTo(GeometricObject a) {
		if (this.getArea() < a.getArea()) {
			return -1;
		}
		if (this.getArea() == a.getArea()) {
			return 0;
		}
		return 1;
	}
	
	
	
}