package Methods_Assignment;

import java.util.Scanner;

public class Test5 {
    public static int smallest (int x, int y, int z){
        return Math.min(x,Math.min(y,z));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        System.out.println("The smallest number is : " +smallest(x,y,z));
    }
}
