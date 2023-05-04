package app.entities;

public class Rectangle {
	double width, height;

	public Rectangle(double x, double y) {
		this.width = x;
		this.height = y;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

}
