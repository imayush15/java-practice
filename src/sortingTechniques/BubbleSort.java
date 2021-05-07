package sortingTechniques;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();
        int[] a = new int[size];
        int n = a.length;
        int i, j;
        for(j = 0; j<size; j++) {
            System.out.print("Enter the Value of Array : ");
            a[j] = sc.nextInt();
        }
        for(i=0; i<n-1; i++) {
            for(j=0; j<n-1; j++) {
                if(a[j+1] < a[j]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("Sorted Array :\n");
        for(int item: a) {
            System.out.print(item + " ");
        }
    }
}