package Conditional_Assignment;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        char opr;
        Double num_1;
        Double num_2;
        Double ans;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an operator : (+,-,*,/)");
        opr=sc.next().charAt(0);
        System.out.println("Enter first number : ");
        num_1= sc.nextDouble();
        System.out.println("Enter second number : ");
        num_2= sc.nextDouble();
        switch (opr){
            case '+':
                ans=num_1+num_2;
                System.out.println(num_1+ " + " +num_2+ " = " +ans);
                break;
            case '-':
                ans=num_1-num_2;
                System.out.println(num_1+ " - " +num_2+ " = " +ans);
                break;
            case '*':
                ans=num_1*num_2;
                System.out.println(num_1+ " * " +num_2+ " = " +ans);
                break;
            case '/':
                ans=num_1/num_2;
                System.out.println(num_1+ " / " +num_2+ " = " +ans);
                break;
            default:
                System.out.println("Error!!! The Operator  you have given is not Correct ");
                break;
        }
    }
}
