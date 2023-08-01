package Day05.Review;

import java.util.Scanner;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수 1~100 까지 반복하면서
		// 해당 수가 3 6 9 일때 
		// 369가 되는 개수만큼 "*"을 출력하는 프로그램 작성
		
		
		
		for (int i = 1; i <= 100; i++) {
			//십의 자리 일의 자리 수 구하기
			int one = i % 10;
			int ten = i / 10;
			//각 자리 수 3의 배수 확인
			boolean one369 = (one == 3 || one == 6 || one == 9);
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);
			
			
			//출력
			if( one369 && ten369 ) {
				System.out.println("**");
			} else if(one369 || ten369) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}
		
		}
		sc.close();
		
		
		
	}
}
