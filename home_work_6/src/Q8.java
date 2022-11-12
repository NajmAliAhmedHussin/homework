import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int number,x,i=2,j=2;
        System.out.println("enter number : " );
        Scanner y=new Scanner(System.in);
        number=y.nextInt();

        for( i=2;i<=number;i++)
        {
           // int j=1;
            for( j=2;j<=i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(j>=i)

                System.out.println(i);

        }

    }
}
