package ArrayList_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the arraylist: ");
        int n = scn.nextInt();
        ArrayList<Integer> a3 = new ArrayList<>();
        System.out.println("Enter the elements of arraylist: ");
        for(int i = 0; i < n; i++){
            a3.add(scn.nextInt());
        }
        System.out.println("Enter the indices to swap the elements of : ");
        int i = scn.nextInt();
        int j = scn.nextInt();
        int temp = a3.get(i);
        Collections.swap(a3, i, j);
        for(int k = 0; k < a3.size(); k++){
            System.out.print(a3.get(k) + " ");
        }
    }
}
