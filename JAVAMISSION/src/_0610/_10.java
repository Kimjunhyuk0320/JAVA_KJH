package _0610;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _10 {
	public static void main(String[] args) {
		//Map 사용
		//입력
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		while(true) {
			String st = sc.nextLine();
			if(st.equals("QUIT")) {
				break;
			}else {
			String[] mp = st.split(" ");
			String name = mp[0];
			String money = mp[1];
			map.put(name, Integer.parseInt(money));
			}
		}

		// 출력
		System.out.println("성명\t" + "출장비\t" + "오만원\t" + "만원\t" + "오천원\t" + "천원\t" + "오백원\t" + "백원\t" + "오십원\t" + "십원\t" + "오원\t" + "일원");
		int sum[] = {0,0,0,0,0,0,0,0,0,0};
		int currency[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.print(key + "\t" + value + "\t");
			int num[] = new int[10];
			for (int i = 0; i < currency.length; i++) {
				num[i] = value / currency[i];
				System.out.print(num[i] + "\t");
				sum[i] += num[i];
				value = value % currency[i];
			}
			System.out.println();
		}
		System.out.print("전체 화폐매수: \t");
		for (int i = 0; i < sum.length; i++) {
			int j = sum[i];
			System.out.print(j + "\t");
		}
		sc.close();
	}
}
