package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;
        String s = sc.nextLine();
        int len = s.length();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) != s.charAt(len-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        if(!isPalindrome)
            System.out.println("No");
        else
            System.out.println("Yes");



    }
}
