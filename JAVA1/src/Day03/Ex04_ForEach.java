package Day03;

public class Ex04_ForEach {
	
	public static void main(String[] args) {
		String []week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
		
		//foreach: ctrl + space
		//for( 요소타입 요소명 : 배열) {}
		for (String day : week) {
			System.out.print(day + " "); //day = week[i]
		}
		System.out.println();
		
	}
}
