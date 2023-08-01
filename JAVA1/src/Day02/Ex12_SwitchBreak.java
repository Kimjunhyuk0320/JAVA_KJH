package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 입력받은 정수를 5로 나눈 나머지
		// 2보다 작으면 *출력
		// 그렇지 않으면 **출력
		int rest = num % 5;
		switch (rest) {
		case 0:
		case 1:
			System.out.println("*");
			break;
		//default 블록은 생략가능.
		default:
			System.out.println("**");
			break;
		}
		sc.close();
	}
}
