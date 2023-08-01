package Day03;

public class Ex07_Enum {

	public static void main(String[] args) {
		
		//Enum열거타입
		//요소들을 명명한 값으로 집합을 이루는 자료형
		//특징
		//1. enum을 비교할 때는 값 뿐만 아니라 타입도 비교함
		//2. enum의 상수값이 재정의 되도 다시 컴파일할 필요가 없다
		// values()    :열거체의 모든 요소를 배열로 반환
		
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			
			System.out.print(color + " ");
			
			
		}
		System.out.println();
		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.print("G : " + G);
		
		System.out.println();
		
		int index = G.ordinal();
		System.out.println("GREEN의 index : " + index);
		
		
	}
}
