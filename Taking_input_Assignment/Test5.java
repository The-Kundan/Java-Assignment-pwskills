package Taking_input_Assignment;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String A = sc.next();
            String K = sc.next();
            System.out.println(A+K);
        }
    }
}
