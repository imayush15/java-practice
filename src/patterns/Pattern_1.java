package patterns;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {

        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Output Pattern : \n");
        for(i=0; i<n; i++) {
            for(j=0; j<=n; j++) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
    }
}

