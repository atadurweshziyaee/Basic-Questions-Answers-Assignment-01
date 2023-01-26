//Write a Java program to count how many Characters, upper case letter, lower case letter,
//spaces, numbers and other characters of an input string.

import java.util.Scanner;

class Question_08 {
    public static void main(String args[]) {

        int number = 0, space = 0, other = 0, count = 0;
        int upperCase = 0, lowerCase = 0;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :-");
        str = sc.nextLine();

        char ch[] = str.toCharArray(); //Strings are converted to character by character.
        int size = str.length(); // size of the length of the string is calculated.

        for (int i = 0; i < size; i++) {
            count++;
            if (Character.isUpperCase(ch[i])) {
                upperCase++;
            } else if (Character.isLowerCase(ch[i])) {
                lowerCase++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println("\nUpper case letter " + upperCase);
        System.out.println("Lower case letter " + lowerCase);
        System.out.println("Numbers " + number);
        System.out.println("Characters " + (lowerCase + upperCase));
        System.out.println("Spaces " + space);
        System.out.println("Others " + other);
        System.out.println("Total String " + count);
    }
}