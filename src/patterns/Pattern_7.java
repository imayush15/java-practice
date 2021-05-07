package patterns;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        int i, j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Output Pattern : \n");
        int rows = 2*n-1;
        for(i=1; i<=rows; i++) {
            if(i<=n) {
                for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for(j=1; j<=rows-i+1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
