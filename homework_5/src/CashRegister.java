/*
 *
 * Add a method printReciept to the CashRegister class. The method should print the
 * prices of all purchased items and the total amount due. Hint: you will need to form
 * a string of all prices. Use the concat method of the String class to add additional items
 * to that string. To turn a price into a string, use the call String.valueOf(price).
 *
 * After closing time, the store manager would like to know how much business was
 * transacted during the day. Modify the CashRegister class to enable this functionality.
 * Supply methods getSalesTotal and getSalesCount to get the total amount of all sales
 * and the number of sales.
 */

public class CashRegister
{
    // Instance Variables
    private double purchase;
    private double payment;
    private String priceString = "";
    private int salesCount;
    private double salesTotal;


    public CashRegister() {
        purchase = 0;
        payment = 0;
        salesCount = 0;
        salesTotal = 0;
    }
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
        String price = String.valueOf(amount);
        priceString = priceString.concat(price + " \n         ");
        salesCount++;

    }


    public void recievePayment(double amount)
    {
        payment = payment + amount;
    }


    public double giveChange()
    {
        salesTotal = salesTotal + purchase;
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }


    public void printReceipt()
    {
        System.out.println("Reciept:");

        System.out.println("         " + priceString);

        System.out.println("=================");
        System.out.println("Total:   " + purchase);
    }


    public double getSalesTotal()
    {
        return salesTotal;
    }


    public int getSalesCount()
    {
        return salesCount;
    }
}
