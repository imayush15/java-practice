package reverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String[] s = sc.nextLine().strip().split(" ");

        for(int i = s.length; i>0; i--) {
            System.out.print(s[i-1] + " ");
        }
    }
}
