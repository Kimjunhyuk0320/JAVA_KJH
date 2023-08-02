package Day07.Ex01;

public class Point {
	int x, y;
	//기본생성자
	public Point(){
		this(0, 0);
	}
	
	//매개변수가 있는 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
