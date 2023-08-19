package _0105;

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int j = N - 1 - i;
            int k = 2 * i - 1;
            for (int j1 = 0; j1 <= j; j1++) {
                System.out.print(" ");
            }
            for (int k1 = 0; k1 < k; k1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}