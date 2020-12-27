package Inheritance;

abstract class Account
{
    private int accountID;
    public Account(int accountID)
    {
        this.accountID = accountID;
    }
    public int getAccountID()
    {
        return accountID;
    }
    public void setAccountID(int accountID)
    {
        this.accountID = accountID;
    }
    public abstract double calculateSales();

    public String toString()
    {
        return "Account [\naccountID: " + accountID + "]";
    }
}