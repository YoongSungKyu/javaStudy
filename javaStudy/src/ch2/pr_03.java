package ch2;
import java.util.*;

//정수로된 액수를 입력받아 50,000 10,000 1,000 500 100 50 10 1 각 몇개로 분리되는지 출력
public class pr_03 {
    public static void main(String[] args) {
        System.out.print("액수를 입력하세요 >>");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        sc.close();
        int 장수 = money/50000;
        System.out.println("50,000원 " + 장수 + "장");

        int y = money - 장수 * 50000;
        장수 = y/10000;
        System.out.println("10,000원 " + 장수 + "장");

        y = y - 장수 * 10000;
        장수 = y/1000;
        System.out.println("1,000원 " + 장수 + "장");

        y = y - 장수 * 1000;
        장수 = y/500;
        System.out.println("500원 " + 장수 + "개");

        y = y - 장수 * 500;
        장수 = y/100;
        System.out.println("100원 " + 장수 + "개");

        y = y - 장수 * 100;
        장수 = y / 50;
        System.out.println("50원 " + 장수 + "개");

        y = y - 장수 * 50;
        장수 = y / 10;
        System.out.println("10원 " + 장수 + "개");

        y = y - 장수 * 10;
        System.out.println("1원 " + y + "개");

        sc.close();





    }
}
