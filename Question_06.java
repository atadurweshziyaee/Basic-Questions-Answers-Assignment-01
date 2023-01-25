
// Write a java program to swap to variable.
import java.util.Scanner;

class Question_06 {
    public static void main(String args[]) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :-");
        num1 = sc.nextInt();
        System.out.println("Enter the second number :-");
        num2 = sc.nextInt();

        System.out.println("\nBefore the swapping num1, num2 " + num1 + "," + num2);
        // Swapping technique
        num3 = num2;
        num1 = num2;
        num2 = num3;
        System.out.println("After the swapping num1, num2 " + num1 + "," + num2);
    }
}