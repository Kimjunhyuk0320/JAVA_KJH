package Day02;

public class Ex15_OddEven {
	public static void main(String[] args) {
		//1~20까지의 정수중
		//짝수의 합계 홀수의 합계 각각 출력
	int a = 1;
	int oddSum = 0;
	int evenSum = 0;
	while ( a <= 20 ) {
		//홀수
		if ( a % 2 == 1 ) {
			oddSum += a++;
		} //짝수
		else {
			evenSum += a++;
		}
		
	}
	System.out.println("홀수 합 : " + oddSum);
	System.out.println("짝수 합 : " + evenSum);
	}
}
