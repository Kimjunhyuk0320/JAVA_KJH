package _0610;

import java.util.Scanner;

public class _06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 게임?");
        int game = sc.nextInt();
        for (int n = 1; n <= game; n++) {

        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int num = (int)(45 * Math.random() + 1);
            arr[i] = num;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                } else if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.print("[" + n + "게임] :");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");

        }
        System.out.println();
        }
        sc.close();
    }
}