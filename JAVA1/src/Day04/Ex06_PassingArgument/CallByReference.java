package Day04.Ex06_PassingArgument;

import Day03.Class.Pikachu;

public class CallByReference {
	
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			//arr : 10 20 30 40 50
			arr[i] = (i + 1) * 10;
		}
		
		System.out.println("******setArr 메소드*********");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			
		}
		System.out.println();
	}
	
	public static void setObject(Pikachu pikchu) {
		pikchu.energy = 1000;
		pikchu.type = "불";
		System.out.println("****setObject 메소드 *****");
		System.out.println(pikchu);
		System.out.println();
		
	}
	public static void main(String[] args) {
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "전기";
		
		for (int i = 0; i < arr.length; i++) {
			// 1 2 3 4 5
			arr[i] = i + 1;
		}
		System.out.println("*****main메소드*********");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println(pikachu);
		setArr(arr);
		setObject(pikachu);
		
		
		System.out.println("*****set메소드 호출 후*********");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println(pikachu);
	}
}
