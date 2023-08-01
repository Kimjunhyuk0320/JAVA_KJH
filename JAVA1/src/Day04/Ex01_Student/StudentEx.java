package Day04.Ex01_Student;

public class StudentEx {
	
	public static void main(String[] args) {
		//Student 객체 생성
		Student student = new Student();
		student.name = "김조은";
		student.age = 20;
		student.stNo = "2024001";
		student.major = "전자공학과";
		
		//Student2 객체생성
		Student student2 = new Student("이용성", 20, "20220002", "컴퓨터공학");
		
		int[] scores1 = {10,20,30,40,50};
		
		System.out.println("######학생 1 #######");
		System.out.println("학생1 - 이름: " + student.name);
		System.out.println("학생1 - 나이: " + student.age);
		System.out.println("학생1 - 학번: " + student.stNo);
		System.out.println("학생1 - 전공: " + student.major);
		System.out.println("학생1 - 유튜브 편집 실습 ");
		student.study("유튜브 편집 실습");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20));
		System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(30, 40, 50));
		System.out.println("학생2 - 최종 점수 : " + student.getAverage( scores1 ));
	
		System.out.println("######학생 2 #######");
		System.out.println("학생2 - 이름: " + student.name);
		System.out.println("학생2 - 나이: " + student.age);
		System.out.println("학생2 - 학번: " + student.stNo);
		System.out.println("학생2 - 전공: " + student.major);
		System.out.println("학생2 - 유튜브 편집 실습 ");
		student.study("유튜브 편집 실습");
		System.out.println("학생2 - 중간고사 점수 : " + student.getAverage(10, 20));
		System.out.println("학생2 - 기말고사 점수 : " + student.getAverage(30, 40, 50));
	
	
	
	
	
	}
}
