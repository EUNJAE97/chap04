package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

//switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다. 실수와 논리는 비교할 수 없다.
//또한 정확하게 일치하는 경우만 비교할 수 있으며 대소 비교를 할 수 없다는 게 차이점이다.
//case절에는 변수를 사용하지 못한다. (값만 비교 가능)
public class D_switch {

    public void testSimpleSwitchStatement() {
        /* switch 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/

        /* 정수 2개와 연산 기호 문자를 입력 받아서 두 수 의 연산 결과를 출력해보는 간단한 계산기*/
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        /* 연산의 결과를 저장할 변수 */
        int result = 0;

        switch (op) { //case값 반드시 리터럴로 기입 , case 끝엔 항상 break; 기입
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                // second(나누는 수)가 0이면 java.lang.ArithmeticException: / by zero 가 발생한다.
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;

        }
        System.out.println(first + "" + op + "" + second + " = " + result);
                                // "" 로 공백을 만들어서 정수가 정확하게 계산되게한다.

    }

    public void testSwitchVendingMachine() {
        /* switch문 내의 break 문에 대한 흐름을 이해하고 적용할 수 있다.*/

        /* switch문을 이용한 간단한 자판기 */
        System.out.println("=== vending machine ===");
        System.out.println(" 사이다 콜라 환타 바카스 핫식스 ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");
        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;
        /* 하지만 한 개의 메뉴를 선택해도 그 메뉴 이후의 메뉴가 전부 선택이 되는 이상한 자판기가 되었다.
         * 가격 또한 음료별로 다르지만 마지막 메뉴 가격인 10000원으로 고정되어 있다.
         * */
        switch (selectedDrink) {
            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;

            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;

            case "환타":
                System.out.println("환타를 선택하셨습니다.");
                price = 700;

            case "바카스":
                System.out.println("바카스를 선택하셨습니다.");
                price = 2000;

            case "핫식스":
                System.out.println("핫식스를 선택하셨습니다.");
                price = 10000;
        }
        System.out.println(price + "원을 투입해주세요!");
    }

    public void testSwitchVendingMachine2() {
        System.out.println("------------------ 개선된 자판기 --------------------");
        System.out.println("=== OhGiraffers vending machine ===");
        System.out.println(" 사이다 콜라 환타 바카스 핫식스 ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");
        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;
        String order = "";
        switch (selectedDrink) {
            case "사이다":
                order = "사이다";
                price = 500;
                break;
            case "콜라":
                order = "콜라";
                price = 600;
                break;
            case "환타":
                order = "환타";
                price = 700;
                break;
            case "바카스":
                order = "바카스";
                price = 2000;
                break;
            case "핫식스":
                order = "핫식스";
                price = 10000;
                break;
            default:
                order = "없는 음료";

        }
        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");

    }
}
