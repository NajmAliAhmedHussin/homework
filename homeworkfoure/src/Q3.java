import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {


        String k,x;

        Scanner in=new Scanner(System.in);
        {

            String g = in.nextLine();

            k = g.replaceAll("i", "!");

            System.out.println(k);

            x = k.replaceAll("s", "$");

        }
        System.out.println(x);
    }
}
