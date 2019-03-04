package joel.mini.programs;

import java.util.Scanner;

public class HowManyRabbits {
    public static void main(String[] args) {

        System.out.println("Welcome to How Many Rabbits!");
        System.out.println("This number will list the first X amount of Fibonacci numbers you would like.");
        System.out.print("How many Fibonacci numbers do you wish to view? : ");
        Scanner number = new Scanner(System.in);
        int input = number.nextInt();
        int n = input, t1 = 0, t2 = 1;
        System.out.print("The first " + n + " Fibonacci numbers are: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
