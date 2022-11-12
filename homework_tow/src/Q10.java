import java.util.Scanner;

public class Q10 {



        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int s,e,f,w;
            System.out.println("enter frist number");
            int d=in.nextInt();
            System.out.println("enter the scond number");
            int o=in.nextInt();
            {
                System.out.println("Sum =    "+ (d+o));
                s=  Math.min(d,o);
                e=   Math.max(d,o);
                System.out.println("Differince   "+(s-e));
                System.out.println("Product:   "+(d*o));
                float  h=(d+o);
                h=h/2;
                System.out.println("Average:    "+h);

                w=  Math.min(d,o);
                f=   Math.max(d,o);
                System.out.println("Distance:   "+(f-w));
                System.out.println("Maximum:    "+Math.max(d,o));
                System.out.println("Minimum:    "+Math.min(d,o));

            }}
}
