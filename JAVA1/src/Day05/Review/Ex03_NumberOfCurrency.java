package Day05.Review;

import java.util.Scanner;

/*
 	화폐 매수 구하기
 	금액			: 537620원
 	50000		: 10개
 	10000		: 3개
 	5000		: 1개
 	1000		: 2개
 	500			: 1개
 	100			: 1개
 	50			: 0개
 	10			: 2개
 	5			: 0개
 	1			: 0개
 	
 	위와같이 금액을 입력하면
 	큰 화폐단위부터 계산하여 화폐단위별로 화폐매수를
 	출력하는 프로그램을 작성하시오
 */
public class Ex03_NumberOfCurrency {
		/*
		 	(순서도) *우선적으로 필요한 변수 선언 (입력 금액), (화폐매수), (화폐단위)
		 	1. 금액 입력받기
		 	2. 화폐 arr 설정
		 	3. 반복문 설정
		 	4. 장수 = 금액/ 화폐단위
		 	5. 나머지 = 금액 % 화폐단위
		 	6. 5의 나머지를 금액에 넣고 4~5반복
		 	7. 출력
		 */
	
	
	public static void main(String[] args) {
		//금액 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		
		//화폐 단위 arr 설정
		int arr[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		//화폐단위 당 장수 arry 설정 
		int arry[] = new int[10];
		
		//몇장인지 값 받기, 나머지 받아내기
		for (int i = 0; i < arr.length; i++) {
			arry[i] = money / arr[i];
			money %= arr[i];
		}
		
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t : " + arry[i] + "개");
		}
		sc.close();
		
	}
}
