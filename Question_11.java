// Write a program to convert binary to decimal.

import java.util.*;
class Question_11 {
    public static void main(String args[]){
        int num,rem,quo,result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number like (0 or 1) :-");
        num = sc.nextInt();
        int dummy = num;
        int i=0;
        while(num!=0){
            rem = num % 10;
            quo = num / 10;
            num = quo;
            result = result + rem*(int)Math.pow(2,i);
            i++;
        }
        System.out.println("Decimal number of "+dummy +" is "+ result);
    }
}