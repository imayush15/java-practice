package anagramOfString;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
//        Input from User
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = sc.nextLine();
        boolean isAnagram = false;

        // variable to keep in check for visited variable
        boolean[] visited = new boolean[str2.length()];

//        CONDITIONS FOR ANAGRAM
        if(str1.length() == str2.length()) {
            for(int i=0; i<str1.length(); i++) {
                char c = str1.charAt(i);
                for(int j=0; j<str2.length(); j++) {
                    if(str2.charAt(j) == c && !visited[j]) {
                        isAnagram = true;
                        visited[j] = true;
                        break;
                    }
                }
                if(!isAnagram) {
                    break;
                }
            }
        }
        if(isAnagram) {
            System.out.println("GIVEN STRINGS ARE ANAGRAMS !");
        }else
            System.out.println("NOT ANAGRAMS !");
    }

}
// The above code has time complexity of O(n^2) because of the nested for loops