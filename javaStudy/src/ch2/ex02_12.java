package ch2;

import java.util.Scanner;

// 점수를 입력받아 학점을 매기는 프로그램
public class ex02_12 {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요 >> ");
        System.out.println();
       Scanner sc = new Scanner(System.in);

       int score = sc.nextInt();
       sc.close();
       char grade = 'F';

       if(score >= 90)
           grade = 'A';
       else if((score >= 80) && (score < 90))
           grade = 'B';
       else if((score >= 70) && (score < 80))
           grade = 'C';
     System.out.println("당신의 학점은 '" + grade + "' 입니다.");




    }
}
