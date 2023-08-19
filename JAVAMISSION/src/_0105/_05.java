package _0105;

import java.util.Scanner;

public class _05 {

    public static void menu() {
        System.out.println("=========");
        System.out.println("치킨 메뉴판");
        System.out.println("1. BHC");
        System.out.println("2. BBQ");
        System.out.println("3. 굽네치킨");
        System.out.println("0. 주문 완료");
        System.out.println("=========");
        System.out.print("번호를 입력해주세요 :");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menuname = " ";
        int count = 0;
        int N = 0;
        do {
            menu();
            N = sc.nextInt();
            switch (N) {
            case 1:
                menuname = "BHC";
                System.out.println(menuname + "을/를 주문했습니다.");
                count++;
                break;
            case 2:
                menuname = "BBQ";
                System.out.println(menuname + "을/를 주문했습니다.");
                count++;
                break;
            case 3:
                menuname = "굽네치킨";
                System.out.println(menuname + "을/를 주문했습니다.");
                count++;
                break;

            default:
                System.out.println("0부터 3사이의 정수를 입력하세요.");
                break;
            }
        } while (N != 0);



        System.out.println(count + "개의 메뉴를 주문하였습니다.");
        System.out.println("주문을 종료합니다.");

        sc.close();
    }
}