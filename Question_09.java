
// Write a program to print the ASCII value of a given character.
import java.util.Scanner;

class Question_09 {
    public static void main(String args[]) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Single Character :-");
        ch = sc.next().charAt(0); // This will take only the 0th index. 
        int a = ch;
        System.out.println("The ASCII value of " + ch + " is " + a);

    }
}
