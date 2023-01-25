
// Write a Java prog to print the addition, multiplication, subtraction, division and remainder of two numbers.
import java.util.Scanner;

class Question_04 {
    public static void main(String args[]) {
        float num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first input :-");
        num1 = scan.nextFloat();
        System.out.println("Enter the second input :-");
        num2 = scan.nextFloat();
        // Addition, Subtraction, Multiplication, Division and Remainder.

        System.out.println("The addition of the two numbers is " + num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println("The subtraction of the two numbers is " + num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println("The multiplication of the two numbers is " + num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println("The division of the two numbers is " + num1 + "/" + num2 + "=" + (num1 / num2));
        System.out.println("The remainder of the two numbers is " + num1 + "%" + num2 + "=" + (num1 % num2));

    }
}