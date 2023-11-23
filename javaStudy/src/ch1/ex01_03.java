package ch1;

import java.net.SocketOption;

/**
 * javadoc 사용 예제를 위한 클래스
 */
public class ex01_03 {
    /**
     * 두 정수의 합을 구하는 메소드
     *
     * @param i 합을 구할 첫 번째 정수형 인자
     * @param j 합을 구할 두 번째 정수형 인자
     * @return 두 정수의 합을 리턴
     */
    public static int sum(int i, int j){
        return i + j;
    }
    public static void main(String[] args) {
        int i, j;
        char a;
        String b;
        final int TEN = 10;
        i=1;
        j=sum(i, TEN);
        a = '?';
        b = "hello";

        java.lang.System.out.println(a); // ? 출력
        System.out.println(b);          // hello 출력
        System.out.println(TEN);        // 10 출력
        System.out.println(j);          // 11 출력
    }
}
