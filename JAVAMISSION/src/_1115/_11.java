package _1115;
class Triangle{
	double width;
	double height;
	public Triangle(){
		
	}
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		double area = 0;
		area = width * height / 2;
		return area;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
}

class Rectangle{
	double width;
	double height;
	public Rectangle(){
		
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		double area = 0;
		area = width * height;
		return area;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}

class Circle{
	double radius;
	
	public Circle(){
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = 0;
		area = radius * radius * Math.PI;
		return area;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
class Trapezoid{
	double top;
	double bottom;
	double height;
	public Trapezoid(){
		
	}
	
	public Trapezoid(int top, int bottom, int height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}

	public double getArea() {
		double area = 0;
		area = (top + bottom) * height / 2;
		return area;
	}

	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}
	
}
public class _11 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		Rectangle ractangle = new Rectangle(10, 20);
		Circle circle = new Circle(5);
		Trapezoid trapezoid = new Trapezoid(5, 10, 8);
		
		System.out.println("삼각형의 넓이 : " + triangle.getArea());
		System.out.println("사각형의 넓이 : " + ractangle.getArea());
		System.out.println("원형의 넓이 : " + circle.getArea());
		System.out.println("사다리꼴의 넓이 : " + trapezoid.getArea());
	}
}
