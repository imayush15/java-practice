package array;

import java.util.Scanner;

public class twoDarrayIO {
    public static void main(String[] abc) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows  : ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of Columns : ");
        int col = sc.nextInt();

        int array[][] = new int[row][col]; // Declaring the Array

        for(i=0; i<row; i++) {
            for(j=0; j<col; j++) {
                System.out.print("Enter Value at " +"[" + i +"]" +"[" + j +"]" + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("You Entered : \n");
        for(i=0; i<row; i++) {
            for(j=0; j<col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



    }
}
