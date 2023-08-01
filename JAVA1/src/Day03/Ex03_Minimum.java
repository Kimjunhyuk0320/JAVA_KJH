package Day03;

import java.util.Scanner;

public class Ex03_Minimum {

	public static void main(String[] args) {
	
		//첫째줄에 입력할 개수 N입력받고
		//둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		//N개의 정수 중 최댓값을 구하여 출력하시오.
		
		/*순서도
		 * 1.N 입력받기
		 * 2.N개의 정수 공백두고 입력받기 for과 배열 이용해서
		 * 3.최댓값 비교
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// N입력받기
		int N = sc.nextInt();
		
		//배열생성
		int arr[] = new int[N];
		
		//배열 입력받기
		for (int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
			}	
		int max = arr[0];
		//최댓값 비교
		for(int i = 0 ; i < N ; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max );
		sc.close();
	}
}
