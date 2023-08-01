package Day03.Class;

public class Pikachu {
	//클래스 객체를 정의하는 설계도
	//멤버 :변수 메소드
	
	//변수
	public int energy;
	public String type;
	public int level;
	
	//기본 생성자
	public Pikachu() {
		this( 100, "전기", 1);  //다른 생성자를 호출하는 메소드
//		energy = 100;
//		type = "전기";
//		level = 1;
	}
	//생성자 자동완성
	//alt + shift + s ----- o
	//메소드 오버로딩
	//
	public Pikachu(int energy, String type, int level) {
		//this : 객체 자기자신을 가리키는 레퍼런스
		this.energy = energy;
		this.type = type;
		this.level = level;
	}

	
	
	
	//메소드
	public String aAttack() {
		return "십만볼트";
	
	}
	

	public String bAttack() {
		return "전광석화";
	}
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}
	
}
