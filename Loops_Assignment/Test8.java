package Loops_Assignment;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int number=3;
        int banner=0;
        a = sc.nextInt();
        int d= a;
        for(b=1;b<= a; b++) {
            for (int e = 1; e <= d; e++) {
                System.out.print(" ");
            }
            if (b == 1) {
                System.out.print("2");
            } else {
                for (c = 0; c!= b; ) {
                    banner = 0;
                    for (int k = 2; k < number; k++) {
                        if ((number % k) == 0)
                            banner = 1;
                    }
                    if (banner == 0) {
                        c++;
                        System.out.print(number + " ");
                    }
                    number++;
                }
            }
            System.out.println();
            d--;
        }
    }
}
