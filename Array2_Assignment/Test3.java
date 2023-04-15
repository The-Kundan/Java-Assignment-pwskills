package Array2_Assignment;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the 2d array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the range of rows: ");
        int start_Row = sc.nextInt();
        int end_Row = sc.nextInt();
        System.out.println("Enter the range of columns: ");
        int start_Col = sc.nextInt();
        int end_Col = sc.nextInt();
        int sum = 0;
        while(start_Row <= end_Row){
            int j = start_Col;
            while(j <= end_Col){
                sum += mat[start_Row][j];
                j++;
            }
            start_Row++;
        }
        System.out.println(sum);
    }
}
