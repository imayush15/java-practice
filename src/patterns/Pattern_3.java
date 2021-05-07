package patterns;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Output Pattern : \n");

        for(i=n; i>=0; i--) {
            for(j=1; j<=i; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
