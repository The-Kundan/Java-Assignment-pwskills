package Arrays2_Assignment;
import java.util.Scanner;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arrays: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element " + (i+1) + " of array a:");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            System.out.println("Enter element " + (i+1) + " of array b: ");
            b[i] = sc.nextInt();
        }

        Set<Integer> unionSet = new HashSet<>();
        for (int i : a) {
            unionSet.add(i);
        }
        for (int i : b) {
            unionSet.add(i);
        }

        System.out.println("Size of the union set is: " + unionSet.size());
    }
}
