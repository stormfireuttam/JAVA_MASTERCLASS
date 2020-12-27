package Inheritance;

class Sales extends Account
{
    private int numberOfHours;
    private double ratePerHour;
    public Sales(int accountID, int numberOfHours, double ratePerHour)
    {
        super(accountID);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }
    public int getHours()
    {
        return numberOfHours;
    }
    public void setfHours(int numberOfHours)
    {
        this.numberOfHours = numberOfHours;
    }
    public double getRate()
    {
        return ratePerHour;
    }
    public void setRate(double ratePerHour)
    {
        this.ratePerHour = ratePerHour;
    }
    public double calculateSales()
    {
        return numberOfHours * ratePerHour;
    }
    public String toString()
    {
        return "Sales [\naccountID: " + super.getAccountID() + "\nnumberOfHours: " + numberOfHours + "\nratePerHour: "
                + ratePerHour + "]";
    }
}