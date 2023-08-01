package Day05.Review;


import java.util.Scanner;
public class Ex07_chicken {
	public static void menuOut() {
		System.out.println("#########메뉴판##########");
		System.out.println(" 1. 굽네치킨 - 볼케이노 치킨");
		System.out.println(" 2. BBQ - 황금올리브 반반 치킨");
		System.out.println(" 3. 교촌 - 허니콤보 치킨");
		System.out.println(" 4. BHC - 뿌링클 치킨");
		System.out.println(" 5. 레드락 치킨 - 양념치킨");
		System.out.println(" 0. 종료");
	}
	
	public static String menuIn() {
		String chickenName = "";
		int No = 0;
		int menuNo = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print ("######### 입력 : ");
			menuNo = sc.nextInt();
			
			switch (menuNo) {
			case 1: chickenName = "볼케이노 치킨"; break;
			case 2: chickenName = "황금올리브 반반 치킨"; break;
			case 3: chickenName = "허니콤보 치킨"; break;
			case 4: chickenName = "뿌링클 치킨"; break;
			case 5: chickenName = "양념치킨"; break;
			}
			if( menuNo >= 1 && menuNo <= 5) {
				System.out.println( chickenName + "이 주문되었습니다.");
				No += 1;
			} else {
				System.out.println("1~5사이의 숫자를 입력해주세요");
				} 
		}while (menuNo != 0); 
		
		return (No + "개의 주문을 완료합니다.");
	}
	
	public static void main(String[] args) {
		menuOut();
		System.out.println(menuIn());
	}
	
	
	
}
