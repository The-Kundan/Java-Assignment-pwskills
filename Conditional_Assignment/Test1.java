package Conditional_Assignment;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter Length : ");
        length= sc.nextInt();
        int breadth;
        System.out.println("Enter Breadth : ");
        breadth= sc.nextInt();
        if (length == breadth) {
            System.out.println("It is a Square[]");
        }else {
            System.out.println("It is not a Square[/] , Its a rectangle ");
        }
    }
}
