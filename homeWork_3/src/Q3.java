import java.util.Scanner;
//3. Write a program that reads an integer and prints whether it is negative, zero, or positive.
public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,r;
        System.out.println("enter the number");

        x=in.nextInt();
        if(x==0)
            System.out.println(x+" is zero");

        else    if(x%2==0)
            System.out.println(x+" is even number");

        else if(x%2==1)
            System.out.println(x+" is old number");

    }


}

