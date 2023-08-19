package _0610;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
	
	//입력	
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	//오름차순 정렬
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < i; j++) {
			if (arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	//출력
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	
	
	//내림차순 정렬
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < i; j++) {
			if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	// 출력
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();		
	sc.close();
	}
	
}
