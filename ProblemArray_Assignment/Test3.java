package ProblemArray_Assignment;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) - 1 == n) {
                continue;
            }
            int ind = Math.abs(arr[i]) - 1;
            arr[ind] *= -1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] > 0){
                ans = i + 1;
                System.out.println(ans);
                return;
            }
        }
        System.out.println(n+1);
    }
}
