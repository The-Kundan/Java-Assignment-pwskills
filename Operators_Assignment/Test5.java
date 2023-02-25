package Operators_Assignment;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int n=a^b;
        int count=0;
        while(n!=0){
            n=n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
