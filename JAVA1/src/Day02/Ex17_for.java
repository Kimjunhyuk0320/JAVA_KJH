package Day02;

import java.util.Iterator;

public class Ex17_for {
	
	public static void main(String[] args) {
		// for ( 1초기식 ; 2조건식 ; 3증감식){실행문}
		// 1부터 10까지의 정수 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// 50부터 100까지의 정수 출력
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 1부터 20까지 정수중 짝수만 출력
		for ( int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
			}
		System.out.println();
		
		// 1부터 20까지 정수중 홀수만 출력
		for ( int i = 1; i <= 20; i += 2) {
			if (i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
	}
}
