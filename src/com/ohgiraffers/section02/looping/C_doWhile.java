package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {
    public void testSimpleDoWhileStatement() {
        /* do while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        do {
            System.out.println("최초로 한 번은 동작함...");
        } while (false);
    }

    public void testSimpleDoWhileExample1() {
        /* 키보드로 문자열 입력 받아 반복적으로 출력하기
         *  단, "exit"가 입력 되면 반복을 종료한다.*/
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("문자열 입력 : ");
            str = sc.nextLine();
            System.out.println("입력 받은 문자열 : " + str);
            /* 문자열이 같은지 비교하는 기능은 equals() 메소드로 제공하고 있다. */
        } while (!str.equals("exit")); // ! not 연산자 true랑 false를 반전시킴.
        System.out.println("종료");
    }
}