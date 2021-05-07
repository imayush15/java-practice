package Loops;

import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int a = sc.nextInt();
        System.out.print("Enter the Exponent : ");
        int b = sc.nextInt();
        int exp=1;
        for (int i=0; i<b; i++) {
            exp *= a;
        }
        System.out.println(a + " Raised to " + b + " is " + exp);
    }
}
