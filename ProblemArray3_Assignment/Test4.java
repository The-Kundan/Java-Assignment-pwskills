package ProblemArray3_Assignment;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int i = 0;
        int j = n-1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                System.out.println(++i + " " + ++j);
                return;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(-1);
    }
}
