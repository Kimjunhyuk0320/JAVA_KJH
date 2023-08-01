package Day02;

import java.util.Iterator;

public class Ex19_GuguAll {
	public static void main(String[] args) {
	// 단X(1~9)
	for(int i = 1; i <=9; i++) {
		for(int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.print(i +"X" + j + "=" + result);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
