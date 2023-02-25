package Conditional_Assignment;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cp;
        int sp;
        int amt;
        System.out.println("Enter C.P : ");
        cp= sc.nextInt();
        System.out.println("Enter S.P : ");
        sp= sc.nextInt();
        if (cp <sp) {
            amt=sp-cp;
            System.out.println("The profit is : " +amt);
        } else if (cp>sp) {
            amt=cp-sp;
            System.out.println("The loss is : " +amt);
        }else {
            System.out.println("No Profit No Loss ");
        }
    }
}
