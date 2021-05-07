package array;

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();
        int age[] = new int[size];
        int j;
        for(j = 0; j<size; j++) {
            System.out.print("Enter the Value of Array : ");
            age[j] = sc.nextInt();

        }
        System.out.print("\nYou Entered : ");
        for(j=0; j<age.length; j++) {
            System.out.print(age[j] + " ");
        }
    }
}
