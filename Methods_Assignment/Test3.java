package Methods_Assignment;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(middle(s));
    }
    public static String middle(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2, s.length() / 2 + 2);
        } else {
            return s.substring(s.length()/2,s.length()/2+1);
        }
    }
}
