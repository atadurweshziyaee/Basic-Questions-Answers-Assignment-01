// Write a java program to convert decimal to binary.

import java.util.Scanner;

class Question_10 {
    public static void main(String args[]){

        int num,rem,quo;
        String binary = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number :-");
        num = sc.nextInt();
        int dummy = num;
        
        while(num!=0){
            rem = num % 2;
            quo = num / 2;
            num = quo;
            binary = rem + binary;
        }
        System.out.println("Binary number of "+ dummy + " is " + binary);
    }
}