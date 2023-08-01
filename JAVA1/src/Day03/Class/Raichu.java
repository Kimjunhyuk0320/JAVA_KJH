package Day03.Class;

//상속
// - 키워드 : 자식 클래스 extends 부모 클래스 {}
public class Raichu extends Pikachu {

	public Raichu() {
		super(200, "슈퍼전기", 20);	//피카츄 기본생성자
//		energy = 200;
//		type = "슈퍼전기";
//		level = 20;
	
	}
	//생성자 자동생성
	public Raichu(int energy, String type, int level) {
		super(energy, type, level); 
		
	}
	//메소드 오버라이딩 : 메소드 재정의
	// alt + shift + s -> V
	@Override
	public String aAttack() {
		return "백만볼트";
	}
	@Override
	public String bAttack() {
		return "볼트 체인지";
	}
	
	public String cAttack() {
		if( level >= 40 )
		return "아이언 테일";
		else {
			return "사용불가";
		}
	}
	
	
	
	
	
	
}
