package array;

import java.util.Scanner;

public class arrayAddition {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows for Arrays  : ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of Columns for Arrays : ");
        int col = sc.nextInt();

        int[][] array = new int[row][col]; // Declaring the Array

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Enter Value at " + "[" + i + "]" + "[" + j + "]" + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter for Second Array");

        // Declaring the Second Array
        int[][] array2 = new int[row][col]; // Declaring the Array

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Enter Value at " + "[" + i + "]" + "[" + j + "]" + ": ");
                array2[i][j] = sc.nextInt();
            }
        }
        // Array for storing the addition values
        int[][] array3 = new int[row][col];

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {

                array3[i][j] = array[i][j] + array2[i][j];

            }
        }
        System.out.println("Sum of 1st and 2nd Array is  : \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}