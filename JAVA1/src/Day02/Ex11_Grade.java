package Day02;

import java.util.Scanner;

public class Ex11_Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		//toUpperCase() 대문자로 변환
		String grade = sc.next().toUpperCase();
		switch (grade) {
		case "A":
			System.out.println("90~100점입니다");
			break;
		case "B":
			System.out.println("80~90점입니다");
			break;
		case "C":
			System.out.println("70~80점입니다");
			break;
		case "D":
			System.out.println("60~70점입니다");
			break;
		case "F":
			System.out.println("60점 미만입니다");
			break;

		default:
			System.out.println("A~F사이 문자를 입력해주세요");
			break;
		}
		sc.close();
	}
}
