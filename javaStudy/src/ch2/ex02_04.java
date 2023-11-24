package ch2;

import java.util.Scanner;

// 이름 나이 성별 주소를 입력받아 출력해라
public class ex02_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("제 이름은 " + name + " 입니다");

        String old = sc.next();
        System.out.println("제 나이는 "+ old + " 입니다");

        String sex = sc.next();
        System.out.println("제 성별은 "+ sex + "입니다");

        String city = sc.next();
        System.out.println("제 거주지는 "+ city + "입니다");

        sc.close();


    }
}
