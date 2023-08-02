package Day07.Ex02;

//부모클래스의 추상메소드는 반드시 오버라이딩 해야한다
public class DeskTop extends Computer {

	public void display() {
		System.out.println("DeskTop - display");
	}

	public void typing() {
		System.out.println("DeskTop - typing");
	}

}
