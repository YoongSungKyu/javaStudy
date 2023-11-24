package ch2;

import java.util.Scanner;
//철수와 영희의 가위바위보 승리 결과를 출력하라, val.equals("ss")를 이용
public class OpenChallenge_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("가위, 바위, 보 중에 선택하여 입력하세요.");
        System.out.print("철수 >> ");
        String chul = sc.next();
        System.out.println();

        System.out.print("영희 >> ");
        String young = sc.next();
        System.out.println();


        sc.close();



        if(chul.equals("가위")) {
            if(young.equals("가위"))
                System.out.println("비겼습니다");
            else if(young.equals("바위"))
                System.out.println("철수가 졌습니다.");
            else if(young.equals("보"))
                System.out.println("철수가 이겼습니다.");}

        else if(chul.equals("바위")){
            if(young.equals("바위"))
                System.out.println("비겼습니다");
            else if(young.equals("보"))
                System.out.println("철수가 졌습니다.");
            else if(young.equals("가위"))
                System.out.println("철수가 이겼습니다.");}

        else if(chul.equals("보")){
            if(young.equals("보"))
                System.out.println("비겼습니다");
            else if(young.equals("가위"))
                System.out.println("철수가 졌습니다.");
            else if(young.equals("바위"))
                System.out.println("철수가 이겼습니다.");
        }

    }
}
