package ch2;

import java.util.Scanner;

//원화를 입력받아 달러로 바꾸어 계산 1$ = 1100원
public class pr_01 {
    public static void main(String[] args) {
        System.out.print("원화를 입력하세요 (단위 원)>>");
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        double doll;
        final int CHANGE = 1100;

        doll = mon/CHANGE;

        System.out.println();
        System.out.print(mon + "원은 " + doll + "$입니다");
        sc.close();




    }
}
