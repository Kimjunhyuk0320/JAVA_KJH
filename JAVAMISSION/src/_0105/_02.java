package _0105;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        //첫째줄
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
                sum1 += i;
            }
            else if (i % 2 == 0 && i < N) {System.out.print("+");}
        }System.out.print("=" + sum1);
        System.out.println();
        //둘째줄
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                sum2 += i;
            }
            else if (i % 2 == 1 && i < N) {System.out.print("+");}
        }System.out.print("=" + sum2);
        System.out.println();

        //셋째줄
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
                
            }
        }
        
        sc.close();
    }
}