package Recursion_Assignment3;

import java.util.Scanner;

public class Test2 {
    public static int calculateSum(int n, int m) {
        if (m > 1) {
            return calculateSum(calculateSum(n, m - 1), 1);
        } else {
            return sumOfFirstNNumbers(n);
        }
    }

    public static int sumOfFirstNNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = calculateSum(n, m);
        System.out.println("The " + m + "-th summation of the first " + n + " natural numbers is: " + result);
    }
}
