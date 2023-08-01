package Day02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정보처리 기사 자격증 합격 기준
		//4학년, 60점 이상 합격
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		//중첩 if문은 권장 X
		if (year == 4) {
			if (score >= 60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("응시 자격 요건에 해당되지 않습니다");
			}
		//조건 1 합격
		//4학년 이면서 점수가 60점 이상
		if( year == 4 && score >= 60 ) {
			System.out.println("합격");
		} 
		//조건 2 응시 x
		//4학년  x
			else if ( year != 4) {
			System.out.println("응시 자격 요건에 해당되지 않습니다");
		} 
		//조건 3 불합격
		//4학년 이면서 점수가 60점 이하	
			else {
			System.out.println("불합격");
		}
		sc.close();
		}
}
