package _0610;

import java.util.Scanner;

public class _08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n;
                System.out.print(arr[i][j] + " ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
}