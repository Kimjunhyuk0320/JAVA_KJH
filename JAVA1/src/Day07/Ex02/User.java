package Day07.Ex02;

public class User {
	public static void main(String[] args) {
		Computer computer = new DeskTop();
		// Computer computer2 = new LapTop(); 추상클래스 객체생성 X
		
		Computer computer2 = new Gram();
		LapTop laptop = new Gram();
		Gram gram = new Gram();
		
		computer.turnOn();
		computer.display();
		computer.typing();
		computer.turnOff();

		computer2.turnOn();
		computer2.display();
		computer2.typing();
		computer2.turnOff();
		
		laptop.turnOn();
		laptop.display();
		laptop.typing();
		laptop.turnOff();
		
		gram.turnOn();
		gram.display();
		gram.typing();
		gram.turnOff();
		
		
	}
}
