package anagramOfString;

import java.util.Scanner;

public class BetterAnagram {
    public static void main(String[] args) {
        //        Input from User
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = sc.nextLine();
        boolean isAnagram = true;

//        Creating Arrays for storing the ASCII characters
        int[] a = new int[256] ;
        int[] b = new int[256];

        for(char c: str1.toCharArray()) {
            int index;   // Typecasting character into integer
            index = (int) c;
            a[index]++;
        }

        for(char c: str2.toCharArray()) {
            int index;
            index = (int) c; // Typecasting character into integer
            b[index]++;
        }

        for(int i=0; i<256; i++) {
            if(a[i] != b[i]) {
                isAnagram = false;
                break;
            }
        }
        if(!isAnagram)
            System.out.println("NOT ANAGRAMS !");
        else
            System.out.println("ANAGRAMS!");
    }
}
