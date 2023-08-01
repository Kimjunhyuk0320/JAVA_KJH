package Day02;

import java.util.Scanner;

public class Ex08_elseif {
	
	public static void main(String[] args) {
		// 하갯ㅇ의 성적을 입력받아서 학점출력하시오
		// 90점 A , 80점 B , 70점 C , 60점 이상 D 60점 이하 F
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오 : ");
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		}else if (score >= 70) {
			result = "C";
		}else if (score >= 60) {
				result = "D";
		}else {
			result = "F";
		}
		sc.close();
		System.out.println("학점은 " + result + "입니다.");
	}
}
