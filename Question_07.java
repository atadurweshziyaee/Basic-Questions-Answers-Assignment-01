
// Write a java prog and compute the sum of the digits of an integer.
import java.util.Scanner;

class Question_07 {
    public static void main(String args[]) {
        long digit, rem, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :-");
        digit = sc.nextLong();
        while (digit != 0) {
            rem = digit % 10;
            sum = sum + rem;
            digit = digit / 10;
        }

        System.out.println("The sum of digit itself is " + sum);
    }
}