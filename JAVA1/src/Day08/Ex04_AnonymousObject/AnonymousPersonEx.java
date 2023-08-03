package Day08.Ex04_AnonymousObject;

public class AnonymousPersonEx {
	
	public static void main(String[] args) {
		AnonymousPerson ap = new AnonymousPerson();
		ap.method();
		
		//익명 자식 객체 생성
		Person person = new Person() {
			String name = "손석구";
			int age = 30;
			
			void work() {
				System.out.println(name + "(" + age + ")");
				System.out.println("연기를 합니다");
			}
		};
		
		person.work();
		
		
		
		
	}
	
}
