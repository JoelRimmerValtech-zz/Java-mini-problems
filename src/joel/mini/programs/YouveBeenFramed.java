package joel.mini.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class YouveBeenFramed {
    public static void main(String[] args) {
        System.out.println("Welcome to You've Been Framed!");
        System.out.println("This program will put a frame around a sentence of your choice.");
        System.out.println(" ");
        System.out.print("Enter your sentence here: ");

        ArrayList<String> listOfWords = new ArrayList<>();
        Scanner sentence = new Scanner(System.in);

        String words = sentence.nextLine();
        String[] parts = words.split(" ");
        for (int i=0; i < parts.length; i++) {
            listOfWords.add(parts[i]);
        }

        topBottomLine(lengthOfLongestWord(listOfWords));
        bodyTextLine(listOfWords);
        topBottomLine(lengthOfLongestWord(listOfWords));
    }

    public static int lengthOfLongestWord(ArrayList<String> wordsFromSentence) {
        int longestLength = 0;
        for (int i = 0; i < wordsFromSentence.size(); i++) {
            if (wordsFromSentence.get(i).length() > longestLength) {
                longestLength = wordsFromSentence.get(i).length();
            }
        }
        return longestLength;
    }

    public static void topBottomLine(int lengthOfLine) {
        for (int i = 0; i < lengthOfLine+4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void bodyTextLine(ArrayList<String> bodyLines) {
        int longestLength = lengthOfLongestWord(bodyLines);
        for (int i = 0; i < bodyLines.size(); i++) {
            System.out.print("* " + bodyLines.get(i));
            int numberOfSpaces = longestLength - bodyLines.get(i).length();
            for (int j = 0; j < numberOfSpaces; j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
    }
}
