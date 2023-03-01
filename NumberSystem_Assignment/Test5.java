package NumberSystem_Assignment;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal double number: ");
        double n = sc.nextDouble();
        System.out.println("Enter the number of precision digits: ");
        int k = sc.nextInt();
        int decimal_n =(int)n;
        double fractional_n=n-decimal_n;
        int decimal_binary =0;
        int power =1;
        while (decimal_n!=0){
            int rem = decimal_n%2;
            decimal_binary+=rem*power;
            power*=10;
            decimal_n/=2;
        }
        String s =Integer.toString(decimal_binary) + ".";
        while (k>0 && fractional_n!=0){
            fractional_n*=2;
            int digit =(int)fractional_n;
            s+=digit;
            fractional_n =fractional_n-digit;
            k--;
        }
        System.out.println(s);
    }
}
