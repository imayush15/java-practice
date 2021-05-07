package patterns;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Output Pattern : \n");

        for(i=1; i<=n; i++) {
            for(j=1; j<n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.printf("$  ");
            }
            System.out.println();
        }

    }
}
