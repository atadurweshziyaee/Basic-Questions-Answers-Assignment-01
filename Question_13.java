import java.util.Scanner;
class Question_13{
    public static void main(String args[]){
        double num,square_root;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :-");
        num = sc.nextDouble();
        square_root = Math.sqrt(num);
        System.out.println("The square root of "+num+" is "+square_root);
        
    }
}