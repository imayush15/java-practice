package Loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c=0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=0; i<n-2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}
