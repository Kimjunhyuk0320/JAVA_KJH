package Day04.Ex02_Calculator;

/**
 * 계산기
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 * 		1. 덧셈	정수2개 덧셈
 * 		2. 뺄셈	정수 인자1 - 인자2 연산
 * 		3. 곱셈	실수 2개를 곱셈
 * 		4. 나눗셈	실수 인자1 / 인자2 연산하는 나눗셈
 * 		5. 나머지	실수 인자1 % 인자2 연산하는 나머지 연산
 * 		6. 합계	배열을 매개뱐수로 전달받아 모든 요소의 합을 구함
 * 		7. 평균	배열을 매개변수로 전달받아, 모든요소의 평균을 구함
 */
public class Calculator {
	//합
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	//차
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	//곱
	public double multiple(double a, double b) {
		double result = a * b;
		return result;
	}
	//나
	public double division(double a, double b) {
		double result = a / b;
		return result;
	}
	//나머지
		public double left(double a, double b) {
			double result = a % b;
			return result;
		}
	//합계
		
		public int sum(int arry[]) {
			int sum = 0;
			for (int i = 0; i < arry.length; i++) {
				sum += arry[i];
			}
			return sum;
		}
	//평균	
		public double avg(int arry[]) {
//			double sum = 0;
//			for (int i = 0; i < arry.length; i++) {
//					sum += arry[i];
//			}
			int sum = sum(arry);
			double average = sum / arry.length;
			return average;
		}	
	
}
