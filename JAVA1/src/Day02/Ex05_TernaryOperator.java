package Day02;

public class Ex05_TernaryOperator {
	public static void main(String[] args) {
		int a = 3, b =5;
		// a와 b 두 수의 차이를 구하시오.
		// a - b = -2
		// b -a = 2
		/// 조건연산자 ( 삼항연산자)
		// (조건) ? : 참일때 문장 : 거짓일 때 문장
		int result = (a > b) ? a-b : b-a;
		System.out.println(" 두 수의 차 : " + result);
		
	}
}
