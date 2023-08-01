package Day04.Ex07_01_AccsessModifier;

public class Person {
	
	// 이름, 키, 나이, 체중
	public String name;
	protected int height;
	int age;
	private int weight;
	
	
	
	//생성자
	public Person() {
		
	}
	//매개변수 생성자
	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", age=" + age + ", weight=" + weight + "]";
	}
}
