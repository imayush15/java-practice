package patterns;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Output Pattern : \n");

        for(i=1; i<=n; i++) {
            for(j=1; j<=i-1; j++) {
                System.out.print("  ");
            }
            for (j=1; j<=n-i+1; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
