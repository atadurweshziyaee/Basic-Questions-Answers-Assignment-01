
// Write a java prog to take five numbers as input and calculate the average of the numbers.
import java.util.Scanner;

class Question_05 {
    public static void main(String args[]) {
        float num1, num2, num3, num4, num5, average;
        Scanner scan = new Scanner(System.in);

        // Taking input of five numbers.

        System.out.println("Entet the first number :-");
        num1 = scan.nextFloat();
        System.out.println("Entet the second number :-");
        num2 = scan.nextFloat();
        System.out.println("Entet the third number :-");
        num3 = scan.nextFloat();
        System.out.println("Entet the fourth number :-");
        num4 = scan.nextFloat();
        System.out.println("Entet the fifth number :-");
        num5 = scan.nextFloat();
        
        // Calculating average.

        average = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("The average of five number is " + average);
    }
}