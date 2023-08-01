package Day01;

public class EX08_Int {
//리터럴
	// : 프로그램에서 직접 표현한 값
	//정수
	// -10진수		0,1,2,3,4,5,6,7,8,9
	// -8진수			0,1,2,3,4,5,6,7,
	//		*0숫자
	// -16진수
	//		*0x숫자	0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F

	public static void main(String[] args) {
		//10진수
		int var1 = 10;
		System.out.println("var1 : " + var1);
		
		// 8진수
		int var2 = 010;
		System.out.println("var2 : " + var2);
		
		//16진수
		int var3 = 0x10;
		System.out.println("var3 : " + var3);
	}

}
