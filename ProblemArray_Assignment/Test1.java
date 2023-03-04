package ProblemArray_Assignment;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] - arr[i]== x){
                    System.out.print("Yes");
                    return;
                }
            }
        }
        System.out.print("No");
    }
}
