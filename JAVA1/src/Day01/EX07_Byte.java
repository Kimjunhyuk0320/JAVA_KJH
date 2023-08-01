package Day01;

public class EX07_Byte {
	public static void main(String[] args) {
	
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128; //한바퀴 돌아버림.127 다음이 -128
		// (에러) byte var6 = 200;
		// Type mismatch 타입 불일치, 데이터 범위를 벗어남(오버플로우)
		System.out.println("Var1: " + var1);
		System.out.println("Var2: " + var2);
		System.out.println("Var3: " + var3);
		System.out.println("Var4: " + var4);
		System.out.println("Var5: " + var5);
	}
}
