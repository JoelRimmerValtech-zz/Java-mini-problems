package joel.mini.programs;

import java.util.Scanner;

public class SeeingDouble {
    public static void main(String[] args) {
        System.out.println("Welcome to Seeing Double, the program that checks whether a word is a Palindrome");
        System.out.print("Enter a word to begin: ");

        Scanner input = new Scanner(System.in);
        String word = input.next();

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println(sb);

        if (sb.toString().equals(word)) {
            System.out.println("This is a Palindrome");
        }
        else
            System.out.println("This is not a Palindrome");
    }
}
