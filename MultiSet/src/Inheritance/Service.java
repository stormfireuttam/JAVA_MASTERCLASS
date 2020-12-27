package Inheritance;

class Service extends Account
{
    private int numberOfItems;
    private int pricePerItem;
    public Service(int accountID, int numberOfItems, int pricePerItem)
    {
        super(accountID);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }
    public int getNumberOfItems()
    {
        return numberOfItems;
    }
    public void setNumberOfItems(int numberOfItems)
    {
        this.numberOfItems = numberOfItems;
    }
    public int getPricePerItem()
    {
        return pricePerItem;
    }
    public void setPricePerItem(int pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }
    public double calculateSales()
    {
        return numberOfItems * pricePerItem;
    }
    public String toString()
    {
        return "Service [\naccountID: " + super.getAccountID() + "\nnumberOfItems: " + numberOfItems
                + "\npricePerItem: " + pricePerItem + "]";
    }
}