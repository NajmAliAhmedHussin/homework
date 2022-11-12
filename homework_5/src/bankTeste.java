public class bankTeste {


    public static void main (String[] args)
    {
        Q3 mySavings = new Q3();
        mySavings.deposit(1000);
        mySavings.withdraw(400);
        mySavings.withdraw(500);

        System.out.println(mySavings.getBalance());
        System.out.println("Expected: 100");

        Q3 myChecking = new Q3(1000);
        myChecking.addInterest(10);

        System.out.println(myChecking.getBalance());
        System.out.println("Expected: 1100");
    }
}


