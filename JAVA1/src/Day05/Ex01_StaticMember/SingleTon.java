package Day05.Ex01_StaticMember;


/*
 	싱글톤 패턴
 	-디자인 패턴 중의 하나로
 	프로그램이 시작 될 때 최초로 한번만 메모리를 할당해서 인스턴스를 사용하는 패턴
 	객체가 필요할 때 새로운 객체를 생성하지 않고 기존의 인스턴스를 활용하는 코드의 패턴
 	객체를 하나만 생성하기 떄문에 메모리를 효율적으로 사용할 수 있더
 */
public class SingleTon {
	
	//3.static으로 유일한 객체를 생성
	private static SingleTon instance = new SingleTon();
	
	//1.생성자를 private로 정의
	private SingleTon() {
		
	}
	//3.유일한 객체를 반환하는 메소드 정의
	public static SingleTon getInstance() {
		if( instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
	
	
}
