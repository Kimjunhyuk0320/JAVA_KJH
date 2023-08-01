package Day05.Review;

import java.util.Scanner;

public class Ex04_Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();
		int N;
		
		//1~45 사이의 6개 랜덤수를 중복 제거하고 오름차순으로 정렬
		for (int k = 0 ; k < game; k++) {
			
		int arry[] = new int[6];
		for (int i = 0; i < arry.length ; i++) {
			int random = (int) (Math.random() * 45 + 1);
			arry[i] = random;
			for (int j = 0; j < i; j++) {
				if ( arry[i] == arry[j]) {
					i--;
				} else if (arry[j]>arry[i]) {
					N = arry[j]; 
					arry[j] = arry[i];
					arry[i] = N;
				}
			}
		}
		System.out.print("[" + (k + 1) + "게임] : ");
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");	
		}
		System.out.println();
		}
		sc.close();
	}
}
