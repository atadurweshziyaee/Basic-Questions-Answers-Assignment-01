// Write a java program that takes two numbers (user input) and display the product of two numbers.

import java.util.Scanner;
class Question_03 {
    public static void main(String args[]){
        int num1,num2,num3;
        Scanner scan = new Scanner(System.in);
        
        //Taking user input.

        System.out.println("Enter the first input :-");
        num1 = scan.nextInt();
        System.out.println("Enter the second number :-");
        num2 = scan.nextInt();

        num3 = num1 * num2;

        System.out.println("The product of two number is " + num3);
    }
}