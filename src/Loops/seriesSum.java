package Loops;

import java.util.Scanner;

public class seriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float n = sc.nextInt();
        float result = 0.0f;
        for(float i=1; i<=n; i++) {
            result = result + (1/i);
        }
        System.out.println("Result is : " + result );
    }
}
