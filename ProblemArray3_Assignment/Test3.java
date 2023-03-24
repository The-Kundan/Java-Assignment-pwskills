package ProblemArray3_Assignment;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i < j){
            int width = j-i;
            int ht = Math.min(height[i], height[j]);
            int area = ht * width;
            ans = Math.max(ans, area);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(ans);
    }
}
