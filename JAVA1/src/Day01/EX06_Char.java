package Day01;

public class EX06_Char {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; //유니코드로 지정
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		int uniCode = c1;
		char b = (char) (c2 + 1);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드 값: " + uniCode);
		System.out.println("b : " + b);
	}

}
