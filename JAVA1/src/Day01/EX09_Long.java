package Day01;

public class EX09_Long {

	public static void main(String[] args) {
		//int(4byte; 32bits) 42억개
		//int 수 표현범위 -21억 ~ 21억
		//long ( 8byte : 64bits) : 2^64개
		long ln1 = 1000;
		long ln2 = 2100000000;
		//long타입 리터럴 : 숫자L
		long ln3 = 2200000000L;
		System.out.println("ln1: " + ln1);
		System.out.println("ln2: " + ln2);
		System.out.println("ln3: " + ln3);
	}

}
