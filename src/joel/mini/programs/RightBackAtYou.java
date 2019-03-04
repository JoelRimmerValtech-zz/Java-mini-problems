package joel.mini.programs;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RightBackAtYou {
    public static void main(String[] args) {
        System.out.println("Welcome to Right Back at you!");
        System.out.println("This allows you to input numbers then see them back in a list,");
        System.out.println("");
        System.out.print("Please enter your first number: ");

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            Scanner number = new Scanner(System.in);
            if (number.hasNextInt()) {
                listOfNumbers.add(number.nextInt());
                System.out.print("Please input next number or type 'Done': ");
                continue;
            }

            System.out.println("Thank you, here is the list of numbers you inputted in reverse order;");

            Collections.reverse(listOfNumbers);
            System.out.print(listOfNumbers);
            break;
        }


    }
}
