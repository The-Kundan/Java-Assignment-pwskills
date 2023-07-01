package Recursion_Assignment3;

import java.util.Scanner;

public class Test1 {
    public static void printPattern(int n, boolean flag) {
        System.out.print(n + " ");

        if (flag) {
            if (n - 5 > 0) {
                printPattern(n - 5, true);
            } else {
                printPattern(n - 5, false);
            }
        } else {
            if (n + 5 <= 20) {
                printPattern(n + 5, false);
            }
        }
    }

    public static void main(String[] args) {
        int n = 16;
        printPattern(n, true);
    }
}
