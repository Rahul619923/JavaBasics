package com.java.learn2;

public class LargestOfThree {
    public static void main(String[] args){
        int a = 3,b= 5, c=0;
        if(a>b && a>c){
            System.out.println("A is largest");
        }else if(b>c){
            System.out.println("B is largest");
        } else{
            System.out.println("C is largest");
        }
    }
}
