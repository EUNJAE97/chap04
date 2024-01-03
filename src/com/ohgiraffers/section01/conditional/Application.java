package com.ohgiraffers.section01.conditional;

public class Application {
    // 문법 숙지
    // 연습 - 실습문제 (1) 알맞은 조건식 (2) 개선점
    public static void main(String[] args) {

        A_if a = new A_if();
//        a.testSimpleIfStatement();
//        a.testNestedIfStatement();
        B_ifElse b = new B_ifElse();
        //b.testSimpleIfElseStatement();
//
        C_ifElseIf c = new C_ifElseIf();
        //c.testSimpleIfElseIfStatement();
        //c.testNestedIfElseIfStatement();
       // c.improveNestedIfElseIfStatement();
        D_switch d = new D_switch();
        d.testSwitchVendingMachine2();
    }
}
