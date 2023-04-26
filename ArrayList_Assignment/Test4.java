package ArrayList_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a4 = new ArrayList<>();
        System.out.println("Enter the elements: ");
        while(sc.hasNextInt()){
            a4.add(sc.nextInt());
        }
        Collections.sort(a4);
        for(int i = 0; i < a4.size(); i++){
            System.out.print(a4.get(i) + " ");
        }
    }
}
