package Ex03_Player;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달리기");
	}

	@Override
	public void jump() {
		System.out.println("아직 점프할 수 없습니다");
	}

	@Override
	public void turn() {

		System.out.println("아직 턴할 수 없습니다");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 입문");
	}
	
}
