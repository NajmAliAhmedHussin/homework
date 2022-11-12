import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        ;
        Scanner x = new Scanner(System.in);
        System.out.println("enter the word");
        String word = x.next();
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.println(word.charAt(i));

        }
    }
}

