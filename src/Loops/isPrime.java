package Loops;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Posititve Number : ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("NEITHER PRIME NOR COMPOSITE !");
        }
        {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    System.out.println("NOT PRIME!");
                    break;
                } else {
                    System.out.println("PRIME !");
                    break;
                }
            }
        }
    }
}
