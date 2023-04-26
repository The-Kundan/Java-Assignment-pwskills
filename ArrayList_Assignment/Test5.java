package ArrayList_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> a5 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                a5.add(arr[i]);
            }
        }
        if(a5.size() == 0){
            System.out.println("NA");
            return;
        }
        for(int i = 0; i < a5.size(); i++){
            System.out.print(a5.get(i) + " ");
        }
    }
}
