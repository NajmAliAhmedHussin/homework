import java.util.Scanner;

public class Q5 {
    // 5. Write a program that reads three numbers and prints “all the same” if they are all the same, “all different”
    //if they are all different, and “neither” otherwise.
//
    public Q5() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three number");
        int e = in.nextInt();
        int k = in.nextInt();
        int r = in.nextInt();
        if (e == k && e == r) {
            System.out.println("all the same");
        } else if (e != k && e != r) {
            System.out.println("all differents");
        } else {
            System.out.println("neither");
        }

    }
}


