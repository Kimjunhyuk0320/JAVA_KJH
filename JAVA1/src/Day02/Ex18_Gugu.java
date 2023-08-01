package Day02;

import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		// 구구단 (1~9단)
		//원하는 단을 입력받아 아래와 같이 구구단 수식 출력
		//입력: 3
		//출력
		//3*1=3
		//3*2=6
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		
		for ( int i = 1 ; i <= 9; i++) {
			int result = dan * i;
			System.out.println(dan + "*" + i + "="+ result);
		}
		sc.close();
	}
}
