package Ex03_Player;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("아주 빨리 달리기");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프하기");
	}

	@Override
	public void turn() {

		System.out.println("한 바퀴 회전합니다");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 고급");
	}
	
}
