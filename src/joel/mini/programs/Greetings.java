package joel.mini.programs;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        System.out.print("My name is: ");

        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.next();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.print("Hello " + name + ", welcome to my program!");
        } else {
            System.out.print("Sorry, I do not recognise you.");
        }


    }
}
