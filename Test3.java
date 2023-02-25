package Taking_input_Assignment;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Mark_1= sc.nextInt();
        int Mark_2= sc.nextInt();
        int Mark_3= sc.nextInt();
        int total_marks = Mark_1+Mark_2+Mark_3;
        int percentage=(total_marks/3);
        System.out.println(total_marks);
        System.out.println(percentage +"%");
    }
}
