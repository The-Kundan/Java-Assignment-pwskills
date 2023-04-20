package ProblemArray2D_Assignment1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int x = 0; x < n / 2; x++) {
            for (int y = x; y < n-x-1; y++) {
                int temp = mat[x][y];
                mat[x][y] = mat[y][n-1-x];
                mat[y][n-1-x] = mat[n-1-x][n-1-y];
                mat[n-1-x][n-1-y] = mat[n-1-y][x];
                mat[n-1-y][x] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
