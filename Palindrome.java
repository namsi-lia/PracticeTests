/*
A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
such as madam or racecar. There are also numeric palindromes,
 */

import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) {
        //declare variables
        String baseWord, reverse = "";

        //initialize scanner class for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String/Number to check whether its a palindrome");

        //this is used to the next string in line
        baseWord = scanner.nextLine();
        int length = baseWord.length();

        for (int l = length - 1; l >= 0; l--) {
            reverse = reverse + baseWord.charAt(l);
        }
        if (baseWord.equals(reverse)) {
            System.out.println("The String/Number entered is a palindrome");
        } else {
            System.out.println("The String/Number entered is not a palindrome");
        }

    }
}
