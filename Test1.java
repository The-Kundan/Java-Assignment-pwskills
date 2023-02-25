package Taking_input_Assignment;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String first_name =scn.next();
        String Last_name =scn.next();
        int roll_num = scn.nextInt();
        String field_of_interest= scn.next();
        System.out.println("Name: "+ first_name +" "+Last_name);
        System.out.println("Roll Number : " +roll_num);
        System.out.println("FIeld of interest : " + field_of_interest);
    }
}
