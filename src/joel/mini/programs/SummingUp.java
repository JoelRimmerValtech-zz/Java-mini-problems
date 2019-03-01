package joel.mini.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {
        System.out.println("Welcome to my program - Summing Up!");
        System.out.print("Enter a number in which this program will add up all the numbers from 0 to your chosen number: ");

        while (true) {
            Scanner numberToAdd = new Scanner(System.in);
            if (numberToAdd.hasNextInt()) {
                int number = numberToAdd.nextInt();
                if (number < 0) {
                    System.out.print("This number is invalid, please select a number with a value greater than 0: ");
                    continue;
                }

                int total = 0;

                for (int i = 1; i <= number; i++) {
                    if ((i % 3 == 0) || (i % 5 == 0)) {
                        total = total + i;
                    }
                }

                System.out.println("The total of the numbers between 0 and your chosen number is: " + total);
                break;
            }
            else {
                System.out.print("Please insert a number greater than 0: ");
            }
        }
    }

}
