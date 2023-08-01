package Day03.Class;

public class Jiwoo {

	public static void main(String[] args) {
		//객체 생성
		// 클래스 타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		
		
		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
		//pikachu.energy = 100;
		//pikachu.type = "전기";
		//pikachu.level = 1;
		
		System.out.println("########피카츄#########");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("레벨 : " + pikachu.level);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());
		
		
		
		Pikachu pikachu20 = new Pikachu(150, "진화", 20);
		System.out.println("########피카츄(Lv.20)#########");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("레벨 : " + pikachu20.level);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());
		
		//상속
		Raichu raichu = new Raichu();
		
		System.out.println("########라이츄#########");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("레벨 : " + raichu.level);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		System.out.println("공격 C : " + raichu.cAttack());
		
		Raichu raichu40 = new Raichu(400, "메가전기", 40);
		
		System.out.println("########라이츄lv. 40#########");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("레벨 : " + raichu40.level);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격 A : " + raichu40.aAttack());
		System.out.println("공격 B : " + raichu40.bAttack());
		System.out.println("공격 C : " + raichu40.cAttack());
		
	}
}
