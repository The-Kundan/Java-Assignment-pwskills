package Conditional_Assignment;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks : ");
        marks= sc.nextInt();
        if (marks >=90) {
            System.out.println("Your Marks is : " +marks + " And your grade is A+");
        } else if (marks>=80) {
            System.out.println("Your Marks is : " +marks + " And your grade is A");
        } else if (marks>=70) {
            System.out.println("Your Marks is : " +marks + " And your grade is B+");
        }
        else if (marks>=60) {
            System.out.println("Your Marks is : " +marks + " And your grade is B");
        }
        else if (marks>=50) {
            System.out.println("Your Marks is : " +marks + " And your grade is C");
        }
        else if (marks>=40) {
            System.out.println("Your Marks is : " +marks + " And your grade is D");
        }
        else if (marks>=30) {
            System.out.println("Your Marks is : " +marks + " And your grade is E");
        }
        else if (marks<30 && marks>=0) {
            System.out.println("Your Marks is : " +marks + " And your grade is F");
        }else
            System.out.println("Enter Valid Marks ");
    }
}
