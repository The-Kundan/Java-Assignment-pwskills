package Loops_Assignment;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int alphabets = 65;
        int num = 0;
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print((char)(alphabets+num++));
            }
            num = 0;
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (size - i) * 2 - 1; k > 0; k--) {
                System.out.print((char)(alphabets+num++));
            }
            num = 0;
            System.out.println();
        }
    }
}
