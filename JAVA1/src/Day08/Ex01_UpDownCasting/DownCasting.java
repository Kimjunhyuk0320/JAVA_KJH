package Day08.Ex01_UpDownCasting;

public class DownCasting {
	public static void main(String[] args) {
		//다운 캐스팅 (강제 형 변환)
		// : 전제조건 - 업 캐스팅
		// 다운캐스팅은 업캐스팅된 부모객체를 자식객체로 변환하는 것
		// - 업캐스팅 : 부모 <- 자식
		// - 다운캐스팅 : 자식 <- 부모
		Person person = new Student("김조은", 20, 1, "신재생에너지과");
		System.out.println(person);
		System.out.println(person.work());
		
		//다운캐스팅
		Student student = (Student) person;
		System.out.println(person);
		System.out.println(person.work());
		
		System.out.println("grade : " + student.grade);
		System.out.println("major : " + student.major);
		
	}
}
