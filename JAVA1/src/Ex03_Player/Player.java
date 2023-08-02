package Ex03_Player;

public class Player {
	
	// 선수의 난이도
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevel();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	//레벨 변경기능
	public void upgrage(PlayerLevel level) {
		this.level = level;
		level.showLevel();
		
	}
	
	public void play(int count) {
		level.go(count);			//PlayerLevel 템플릿 메서드 호출
	}
	
	
	
	
	
	
	
}
