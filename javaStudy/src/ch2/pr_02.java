package ch2;
import java.util.*;

//2자리 정수(10~99)사이 입력받고 십의 자리와 일의 자리가 같은지 판별하는 출력프로그램
public class pr_02 {
    public static void main(String[] args) {
        System.out.print("2자리 정수 입력(10~99) >>");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int ten = x/10;
        int one = x%10;

        if(ten == one)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
        else
            System.out.println("NO! 10의 자리와 1의 자리가 다릅니다");

        sc.close();


    }
}
