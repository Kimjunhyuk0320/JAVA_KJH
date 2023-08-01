package Day04.Ex07_02_AccsessModifier;

import Day04.Ex07_01_AccsessModifier.Person;

public class Student extends Person {

	
	//생성자
	public Student() {
		super();
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";
		height = 160;	//person을 상속받은 class여서 가능
//		age = 20;		default 라서 같은 패키지에서만 접근가능
//		weight = 40;	private 라서 해당 클래스에서만 접근가능
		setAge(20);
		setWeight(40);
	}
	
	
}
