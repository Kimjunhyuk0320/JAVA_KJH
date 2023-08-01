package Day03;

public class Ex05_Arrays {

	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int arr2[][] = {{1, 2, 3}, {4, 5, 6}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
