package Ex03_Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		System.out.println("---------------------");
		
		
		AdvancedLevel level = new AdvancedLevel();
		player.upgrage(level);
		player.play(2);
		System.out.println("---------------------");
		
		SuperLevel level2 = new SuperLevel();
		player.upgrage(level2);
		player.play(3);
		System.out.println("---------------------");
	}
}
