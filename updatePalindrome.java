/*
 function to check whether for any given string or statement there exists a palindrome.
eg motor contains oto which is a palindrome
 */

import java.util.Scanner;

public class updatePalindrome {

    public static void main(String[] args) {
        String baseWord = "";
        boolean checkValidity = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String/Number to check if its a palindrome");
        baseWord = scanner.nextLine();
        for (int l = 0; l > 0; l++) {
            if (baseWord.charAt(l) != baseWord.charAt(0)) {
                checkValidity = false;
                break;
            }
        }
        if (checkValidity) {
            System.out.println("The entered String/Number is a palindrome");

        } else {
            System.out.println("The entered String/Number is not a palindrome");
        }


    }
}
