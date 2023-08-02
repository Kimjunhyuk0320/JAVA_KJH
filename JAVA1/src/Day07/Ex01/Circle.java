package Day07.Ex01;

public class Circle extends Shape {
	double radius;
	
	public Circle() {
		this.radius = 0;
	}
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	double area() {
		return radius*radius*Math.PI;
	}

	@Override
	double round() {
		return 2*Math.PI*radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
