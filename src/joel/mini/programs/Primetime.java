package joel.mini.programs;

import jdk.nashorn.internal.ir.ReturnNode;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Primetime {

    public static void main(String[] args) {

        System.out.print("Enter a number to see if it is a prime number or not along with all the prime numbers inbetween: ");
        Scanner Prime = new Scanner(System.in);
        int number = Prime.nextInt();

        for (int a = 2; a <= number; a++) {
            if (checkPrimeNumber(a))
                System.out.println(a + ": This is a prime number!");
        }
    }

    public static boolean checkPrimeNumber(int number) {
        for (int i=2; i<=number-1; i++) {
            if (number %i == 0) {
                System.out.println(number + ": This is not a prime number!");
                return false;
            }
        }
        return true;
    }
}
