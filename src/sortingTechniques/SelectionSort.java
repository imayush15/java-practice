package sortingTechniques;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        int i, j;
        for (j = 0; j < size; j++) {
            System.out.print("Enter the Value of Array : ");
            arr[j] = sc.nextInt();
        }
            for (i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (j = i; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }

                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            System.out.println("\nSorted Array :\n");
            for(int item: arr) {
                System.out.print(item + " ");
            }
        }
    }

