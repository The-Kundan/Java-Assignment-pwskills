package ProblemArray3_Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while(i < n){
            count++;
            while(i < n-1 && arr[i+1] == arr[i]){
                i++;
            }
            i++;
        }
        if(count >= m){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
