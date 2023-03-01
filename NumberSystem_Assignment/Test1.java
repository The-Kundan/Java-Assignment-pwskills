package NumberSystem_Assignment;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int n = sc.nextInt();
        int binarynum=0;
        int power=1;
        while (n!=0){
            int rem = n%2;
            binarynum+=rem*power;
            power *=10;
            n/=2;
        }
        System.out.println(binarynum);
    }
}
