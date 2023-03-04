package Arrays2_Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("The " +k+"th smallest number is: " +arr[k-1]);
    }
}
