package Day05.Ex01_StaticMember;

public class StaticMember {
	
	
	//static 변수
	static int a;
	static int b;
	int c;						// 객체 생성 후 사용 가능
	static final double PI = 3.141592;
	
	//static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
//		sum += c; 
		// static 멤버가 아니라 접근 불가
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int sum = sum(10,20);
		a = 100;
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		
		int a1 = sm1.a;
		int c1 = sm1.c = 10;
		int a2 = sm2.a;
		int c2 = sm2.c = 20;
		
//		PI = 100;				//final 이라 값 변경 불가능
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
	}
	
}
