import java.util.Scanner;

public class Q1 {
  //  1. Write a program that calculates and prints the product of three integers.
    public static void main(String[] args) {
        float number1,number2,number3,proudect;
        System.out.println("enter three number ");
        Scanner  in=new Scanner(System.in);
        number1=in.nextFloat();
        number2=in.nextFloat();
        number3=in.nextFloat();
        System.out.println(  "product  = " + number1*number2*number3);

    }
}
