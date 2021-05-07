package hackerRank;

import javax.swing.*;
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        System.out.println(A.length() + B.length());

        int Z = B.compareTo(A);
        if(Z > 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        String cap1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cap2 = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(cap1);

    }
}