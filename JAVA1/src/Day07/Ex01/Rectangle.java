package Day07.Ex01;

public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle() {
		this( 0, 0);
	}
	
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	double area() {
		return width * height;
	}

	@Override
	double round() {
		return 2 * (width + height);
	}

	

	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	

}
