import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Q3 {
    public static void main(String[] args) {
        String text;char u;
        System.out.println("ENTER TXET ");
        Scanner x = new Scanner(System.in);
        text = x.next();

        for (int i = 0; i < text.length(); i++) {

            System.out.println(text.charAt(i));
        }
        ;
        // System.out.println(" "+text.toUpperCase()+" ");
    }
}