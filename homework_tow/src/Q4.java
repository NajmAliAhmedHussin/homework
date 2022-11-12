import java.util.Scanner;
//4. Write a Java program that takes three numbers as input to calculate and print the average of the numbers
public class Q4 {

        public static void main(String[] args) {
            float c;
            Scanner in=new Scanner(System.in);
            System.out.println("enter three number");
            float d=in.nextInt();
            float g=in.nextInt();
            float h=in.nextInt();
            c=(d+g+h)/3;
            System.out.println("avrage =" + c);

}}
