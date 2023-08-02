package Ex03_Player;

public abstract class PlayerLevel {
	
	// 달리기, 점프, 회전
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	//난이도 출력 메세지
	public abstract void showLevel();
	
	//템플릿 메소드
	final public void go(int count) {
		run();
		
		for (int i = 0; i < count ; i++) {
			jump();
		}
		turn();
	}
	
	
	
	
	
	
	
}
