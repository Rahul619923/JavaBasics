package com.java.learn3;

public class FallThroughDemo {
    public static void main(String[] args){
        int x =1;
        switch(x) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three ");
            default :
                System.out.println(" Done ");
        }
    }
}
