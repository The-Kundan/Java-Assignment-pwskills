package ArrayList_Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arraylist: ");
        int n = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        System.out.println("Enter the elements of arraylist: ");
        for(int i = 0; i < n; i++){
            a1.add(sc.nextInt());
        }
        System.out.println("Enter the element to be inserted: ");
        int x = sc.nextInt();
        a1.add(0, x);
        for(int k = 0; k < a1.size(); k++){
            System.out.print(a1.get(k) + " ");
        }
    }
}
