package com.java.learn3;

public class CalculatorSwitch {
    public static void main(String [] args){
        int a =28;
        int b = 26;
        char operator = '*';
        switch(operator){
            case '+':
                System.out.println("Addition :"+ (a+b));
                break;
            case '-':
                System.out.println("Subtraction  :"+ (a-b));
                break;
            case '*':
                System.out.println("Multiplication :"+ (a*b));
                break;
            case '/':
                System.out.println("Division : +(a/b");
                break;
            default:
                System.out.println("Invaild operator");

        }
    }
}
