package Conditional_Assignment;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x;
        System.out.println("Enter the number : ");
        x= sc.nextInt();
        if (x >=0) {
            System.out.println("You have entered a positive number ");
        }else {
            System.out.println("You have entered a negative number ");
        }
    }
}
