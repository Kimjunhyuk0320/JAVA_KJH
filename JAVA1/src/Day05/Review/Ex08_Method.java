package Day05.Review;

import java.util.Scanner;

public class Ex08_Method {

	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();

		System.out.println(plus(a, b));
		System.out.println(minus(a, b));
		sc.close();

	}

}
