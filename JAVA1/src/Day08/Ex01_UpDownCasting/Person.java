package Day08.Ex01_UpDownCasting;

public class Person {
	String name;
	int age;
	
	public Person() {
		this( "이름없음", 0);
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String work() {
		return "일을 합니다";
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
