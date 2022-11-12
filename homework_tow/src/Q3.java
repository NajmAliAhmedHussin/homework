import java.util.Scanner;
public class Q3 {
//2. Write a Java program to print the area and perimeter of a circle.
        public static void main(String[] args){
            double r,c,x;
            Scanner in=new Scanner(System.in);
            System.out.println("ENTER Radius");
            int d=in.nextInt();
            double purify=3.14;
            x=purify*(d*d);
            System.out.println("THE AREA =" + x + "  cm");
            c=2*purify*x;
            System.out.println("THE CIRMFERENCE = " + c);

        }}


