/*
 function to check whether for any given string or statement there exists a palindrome.
eg motor contains oto which is a palindrome
 */

import java.util.Scanner;

public class updatePalindrome {
    public static boolean checkValidity (String string,int baseWord,int reverse) {
       if (baseWord == reverse) {
           return true;
       }
       if (string.charAt(baseWord) != string.charAt(reverse)) {
           return false;
       }
       if (baseWord < reverse + 1) {
           return checkValidity(string, baseWord + 1, reverse - 1);
       }
        return true;
    }
    static boolean checkPalindrome(String string){
        int j=string.length();
        if(j==0){
          return true;
        }
        return checkValidity(string,0,j-1);
    }
    public static void main(String[]args){
        String baseWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String/Number to check if its a palindrome");
        baseWord = scanner.nextLine();
        if(checkPalindrome(baseWord)){
            System.out.println("The entered String/Number is a palindrome");
        }else{
            System.out.println("The entered String/Number is not a palindrome");
        }

    }
}



