package ArrayList_Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arraylist: ");
        int n = sc.nextInt();
        ArrayList<Integer> a2 = new ArrayList<>();
        System.out.println("Enter the elements of arraylist: ");
        for(int i = 0; i < n; i++){
            a2.add(sc.nextInt());
        }
        a2.remove(2);
        for(int i = 0; i < a2.size(); i++){
            System.out.print(a2.get(i) + " ");
        }
    }
}
