package _0105;

import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            //십의 자리 일의 자리 수 구하기
            int one = i % 10;
            int ten = i / 10;
            //각 자리 수 3의 배수 확인
            boolean one369 = (one == 3 || one == 6 || one == 9);
            boolean ten369 = (ten == 3 || ten == 6 || ten == 9);


            //출력
            if( one369 && ten369 ) {
                System.out.println("**");
            } else if(one369 || ten369) {
                System.out.println("*");
            } else {
                System.out.println(i);
            }

        }
        sc.close();



    }
}