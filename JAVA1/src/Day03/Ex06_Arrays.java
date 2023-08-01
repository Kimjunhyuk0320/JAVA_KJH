package Day03;

import java.util.Scanner;

public class Ex06_Arrays {

	public static void main(String[] args) {
		
		// 비정방 행렬 배열
		
		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
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
		
	sc.close();
	}
}
