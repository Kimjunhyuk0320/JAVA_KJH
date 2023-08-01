package Day05.Review;

import java.util.Scanner;

public class Ex06_Matrix {
	public static void main(String[] args) {
		//양의 정수를 M과N을 입력받아 저장하고
		//M행 N열의 2차워 배열을 생성한다
		//각 요소의 값을 입력받고 그대로 출력하시오
		//입력예시
		//M:2
		//N:3
		//1 2 3
		//4 5 6
		//출력 예시
		// 1 2 3
		// 4 5 6
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		
		// M행 N열의 2차원 배열 선언 및 생성
		int arr[][] = new int[M][N];
		
		
		//2차원 배열은 이중반복문으로 접근
		//바깥 반복문		-반복변수 i :행
		//안 반복문		-반복변수 j :열
		//arr.length		:행크기
		//ar[i].length		:열크기
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//위와 같이, X행 Y열 2차원 배열을 생성하고
		//순서대로 값을 입력받아 그대로 출력해보세요
		// 단 출력시 foreach 문 사용
		System.out.print("X : ");
		int X = sc.nextInt();
		System.out.print("Y : ");
		int Y = sc.nextInt();
		
		// M행 N열의 2차원 배열 선언 및 생성
		int arry[][] = new int[X][Y];
		
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				arry[i][j] = sc.nextInt();
			}
		}
		for (int[] num : arry) {
			for (int is : num) {
				System.out.print(is + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}