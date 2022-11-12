
import java.util.Scanner;

public class Q7 {
    //  7. Write a program that reads in three integers and
    //prints “in order” if they are sorted in ascending or descending order, or “not in order” otherwise.

    public Q7() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = in.nextInt();
        System.out.println("enter second number ");
        int b = in.nextInt();
        System.out.println("enter third number ");
        int c = in.nextInt();
        if ((a < b || b < c) && (a > b || b > c)) {
            System.out.println("not in order");
        } else {
            System.out.println("in order");
        }

    }
}

