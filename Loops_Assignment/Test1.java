package Loops_Assignment;
import java.util.Scanner;
public class Test1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = 1;
            int y = 1;
            for(int i = 1; i <= n; i++){
                System.out.print(x + " ");
                int sum = x+y;
                x = y;
                y = sum;
            }
        }
}
