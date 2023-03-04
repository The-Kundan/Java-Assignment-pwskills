package ProblemArray_Assignment;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
