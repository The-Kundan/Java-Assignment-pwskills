package ProblemArray2D_Assignment3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the array: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || i+j == n-1){
                    if(mat[i][j] == 0){
                        System.out.println("false");
                        return;
                    }
                }else{
                    if(mat[i][j] != 0){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        System.out.println("true");
    }
}
