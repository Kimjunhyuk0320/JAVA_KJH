package Day05.Review;

import java.util.Scanner;

/*
   #########메뉴판##########
   1. 굽네치킨 - 볼케이노 치킨
   2. BBQ - 황금올리브 반반 치킨
   3. 교촌 - 허니콤보 치킨
   4. BHC - 뿌링클 치킨
   5. 레드락 치킨 - 양념치킨
   0. 종료
   ######### 입력 :
   
   메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
   "(해당베뉴) 이 주문되었습니다." 라고 출력하시오.
   0을 입력하기 전까지 반복하고
   0을입력하면 반복을 종료합니다.
   종료시, "?개의 주문을 완료합니다."라고 출력하시오.
 */
public class Ex07_ChickenMenu {
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		String chickenName = "";
		int No = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("#########메뉴판##########");
			System.out.println(" 1. 굽네치킨 - 볼케이노 치킨");
			System.out.println(" 2. BBQ - 황금올리브 반반 치킨");
			System.out.println(" 3. 교촌 - 허니콤보 치킨");
			System.out.println(" 4. BHC - 뿌링클 치킨");
			System.out.println(" 5. 레드락 치킨 - 양념치킨");
			System.out.println(" 0. 종료");
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
			} else {break;}
		}while (menuNo != 0);
		System.out.println( No + "개의 주문을 완료합니다.");
		}	
		
}
	
