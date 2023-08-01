package Day01;

import java.util.Scanner;

public class Ex13_Circle {

	public static void main(String[] args) {
		// 상수
		// - 프로그램 실행동안 값을 변경하지 않고 사용할 값
		// * 상수선언시 반드시 값을 초기화 해야한다
		//* 선언후에 값을 변경하면 에러가 발생한다.
		// - 키워드 : final
		final double PI = 3.141592;
		// PI = 3.14; 상수는 값 변경하면 에러남
		Scanner sc = new Scanner(System.in);
		// 바로 엔터는 shift + enter
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이 :" + area);
		sc.close();
	}

}
