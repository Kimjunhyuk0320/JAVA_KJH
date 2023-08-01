package Day02;

import java.util.Scanner;

public class Ex20_Continue {
	
	public static void main(String[] args) {
		// 5개의 정수를 입력받아
		// 입력받은 수 중 양수 만 합계를 구하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5 ; i++) {
			int n = sc.nextInt();
			
			if (n < 0) {
			continue;
			}
			sum += n;
		}
		System.out.println(sum);
		sc.close();
	}
}