// Write a java program to convert a string to an integer.
import java.util.Scanner;
class Question_12 {
    public static void main(String args []){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :-");
        str = sc.nextLine();
        int number = Integer.parseInt(str); // It will only convert an integer string to an original Integer.
        System.out.println("Your integer number is "+number);

    }
}