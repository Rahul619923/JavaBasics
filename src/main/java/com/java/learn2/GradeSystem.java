package com.java.learn2;

public class GradeSystem {
    public static void main(String [] args){
        int marks = 89;
        if(marks >75){
            System.out.println("Grade A");
        } else if(marks>60){
            System.out.println("Grade B");
        } else if (marks>35){
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
