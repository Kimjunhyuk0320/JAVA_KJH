package Day08.Ex04_AnonymousObject;

public class AnonymousPerson extends Person{
	
	// 익명 자식 객체 생성
	Person person = new Person();
	
	void work() {
		System.out.println(name + "(" + age + ")");
		System.out.println("프로그래밍을 합니다");
		System.out.println();
	};

	Person person2 = new Person() {
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("요리를 합니다");
			System.out.println();
		}
	};
	
	void method() {
		person.name = "김조은";
		person.age = 20;
		person.work();
		
		person2.name = "백종원";
		person2.age = 40;
		person2.work();
		
		
	}
	
	
}
