package Day02;

public class Ex03_logicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		//AND (&&)
		// A AND B : 둘다 참일때 true
		System.out.println(true && true);
		System.out.println(true && false);
		
		// or(||)
		// A or B 둘중 하나만 true 이면 참
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (100 < 50));
		System.out.println((5 > 20) || (5 > 2));
		System.out.println();
		
		// XOR(^)
		// A XOR B : A와 B가 다를 때 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		
		//NOT (!)
		//!A 반대로
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//쇼트서킷
		// 논리 연산의 결과를 미리 알아서 남은 논리식을 확인하지 않는 것
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(true || ++value2 > 5);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 5);
		System.out.println(value4);
		//비트연산자는 쇼트서킷 적용 X
		
	}

}
