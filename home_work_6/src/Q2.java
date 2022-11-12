import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int sum=0,i;
       // System.out.println("the sum of all even numbers between 2 and 100 = ");
        for ( i=2;i<=100;i++)
        {

            if(i%2==0) {
                System.out.print(i+"+");

            }
            sum  =sum+i;
        }
        System.out.println("\n"+"the sum of all even numbers between 2 and 100  = "+sum+"\n");

        int num1,num2,j,sum2=0;
        Scanner x=new Scanner(System.in);

        System.out.print("enter numper1= ");
    num1= x.nextInt();
        System.out.print("enter numper2= "+"\n");

        num2=x.nextInt();
    for( j=num1;j<=num2;j++)
    {
        if(j%2==1)
        {

            System.out.print("+"+j+" ");

        }
sum2=sum2+j;
       // System.out.println();
    }
    System.out.print("\n"+"the sum of all old numbers between number1 = "+num1+" and number2  = "+sum2);

    }
}
