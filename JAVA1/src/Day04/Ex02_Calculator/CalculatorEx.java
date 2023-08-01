package Day04.Ex02_Calculator;

public class CalculatorEx {
	public static void main(String[] args) {
		
		//계산기 객체 생성
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 5;
		double x = 10.25;
		double y = 5.4;
		int arr[] = {1,2,3,4,5};
		
		int plus = calculator.plus(a, b);
		int minus = calculator.minus(a, b);
		double multiple = calculator.multiple(x, y);
		double division = calculator.division(x, y);
		int sum = calculator.sum(arr);
		double avg = calculator.avg(arr);
		
		System.out.println("plus : " + plus);
		System.out.println("minus : " + minus);
		System.out.printf("multiple : %5.2f \n", multiple);
		System.out.printf("divide : %5.2f \n", division);
		
		// printf("포맷", 변수) : %X.Y(리터럴)
		// X 칸수( 양수이면 오른쪽 정렬, 음수이면 왼쪽)
		// Y 소숫점 뒤의 칸수
		//(리터럴) : %d 정수, %f (실수), %s (문자열)
		
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
		
	}
}
