package joel.mini.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class LeapingForJoy {

    public static void main(String[] args) {
        System.out.println("Welcome to Leaping For Joy!!");
        System.out.println("This program will tell you the next 'however' many leap years you wish to know.");
        System.out.println();
        System.out.print("Type the number of leap years you wish to know from this year onwards: ");
        Scanner numberOfLeapYears = new Scanner(System.in);
        int number = numberOfLeapYears.nextInt();

        int listOfYears = number*4;

        ArrayList<Integer> listOfPossibleLeapYears = new ArrayList<>();
        for (int X=2019; X<=2019+listOfYears; X++) {
            listOfPossibleLeapYears.add(X);
        }

        System.out.println("The next " + number + " leap years are: ");
        ArrayList<Integer> LeapYears = new ArrayList<>();
        for (int i = 0; i < listOfPossibleLeapYears.size(); i++) {
            int year = listOfPossibleLeapYears.get(i);
            if ((year % 4 == 0) && (year % 100 != 0)) {
                LeapYears.add(year);
                System.out.println(year);
            }
            else if (year % 400 == 0) {
                LeapYears.add(year);
                System.out.println((year));
            }
        }
    }
}
