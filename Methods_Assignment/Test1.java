package Methods_Assignment;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(avg(x,y,z));
    }
    public static int avg( int x,int y, int z){
        return (x+y+z)/3;
    }
}
