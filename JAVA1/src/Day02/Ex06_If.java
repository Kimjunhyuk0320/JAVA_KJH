package Day02;

import java.util.Scanner;

public class Ex06_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 입력받은 값이 홀수인지 짝수인지 판단
		// if(조건) {}
		if (num % 2 == 0) {
			System.out.println("짝수입니다");
		} if (num % 2 == 0) {
			System.out.println("홀수입니다");
		}
		sc.close();
	}
}
