package Array2_Assignment;

import java.util.Scanner;

public class Test4 {
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
        for(int i = 0; i < n; i++){
            int a = 0;
            int b = m-1;
            while(a < b){
                int temp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = temp;
                a++;
                b--;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
