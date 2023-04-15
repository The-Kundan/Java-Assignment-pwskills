package Array2_Assignment;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of 2d array you want to convert to: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[r*c];
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of 1D array: ");
        for(int i = 0; i < r*c; i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = arr[index];
                index++;
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
