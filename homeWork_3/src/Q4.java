import java.util.Scanner;

public class Q4 {
    /*   4. Write a program that reads an integer and prints how many digits the number has,
       by checking whether the number is ≥ 10, ≥ 100, and so on.
           (Assume that all integers are less than ten billion.) If the number is negative, first multiply it with –1.*/
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in=new Scanner(System.in);
        long num=in.nextLong();

        if(num<0)
        {
            num=num*-1;

        }
        int digit;
        if(num>999999999)
        {
            digit=10;
        }
        else if(num >99999999)
        {
            digit=9;
        }
        else if(num >9999999)
        {
            digit=8;
        }
        else if(num >999999)
        {
            digit=7;
        }
        else if(num >99999)
        {
            digit=6;

        }
        else if(num >9999)
        {
            digit=5;
        }

        else if(num >999)
        {
            digit=4;
        }
        else if(num >99)
        {
            digit=3;
        }
        else if(num >9)
        {
            digit=2;
        }
        else
        {
            digit=1;
        }
        System.out.println("the number " + num + " has "+digit+"  digits");
    }
}

