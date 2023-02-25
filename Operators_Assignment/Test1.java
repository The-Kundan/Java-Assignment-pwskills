package Operators_Assignment;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((((a+8)/3)%5)*5);
    }
}
