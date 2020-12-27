package Inheritance;

public class Inheritance {

    public static void main(String[] args) {

        abstract class Account {
            private int accountID;

            public Account(int accountID) {
                this.accountID = accountID;
            }

            public int getAccountID() {
                return accountID;
            }

            public void setAccountID(int accountID) {
                this.accountID = accountID;
            }

            public abstract double calculateSales();

            @Override
            public String toString() {
                return "Account [\naccountID: " + accountID + "]";
            }

        }

        class Sales extends Account {
            private int numberOfHours;
            private double ratePerHour;

            public Sales(int accountID, int numberOfHours, double ratePerHour) {
                super(accountID);
                this.numberOfHours = numberOfHours;
                this.ratePerHour = ratePerHour;
            }

            public int getHours() {
                return numberOfHours;
            }

            public void setfHours(int numberOfHours) {
                this.numberOfHours = numberOfHours;
            }

            public double getRate() {
                return ratePerHour;
            }

            public void setRate(double ratePerHour) {
                this.ratePerHour = ratePerHour;
            }

            @Override
            public double calculateSales() {
                return numberOfHours * ratePerHour;
            }

            @Override
            public String toString() {
                return "Sales [\naccountID: " + super.getAccountID() + "\nnumberOfHours: " + numberOfHours + "\nratePerHour: "
                        + ratePerHour + "]";
            }
        }

        class Service extends Account {
            private int numberOfItems;
            private int pricePerItem;

            public Service(int accountID, int numberOfItems, int pricePerItem) {
                super(accountID);
                this.numberOfItems = numberOfItems;
                this.pricePerItem = pricePerItem;
            }

            public int getNumberOfItems() {
                return numberOfItems;
            }

            public void setNumberOfItems(int numberOfItems) {
                this.numberOfItems = numberOfItems;
            }

            public int getPricePerItem() {
                return pricePerItem;
            }

            public void setPricePerItem(int pricePerItem) {
                this.pricePerItem = pricePerItem;
            }

            @Override
            public double calculateSales() {
                return numberOfItems * pricePerItem;
            }

            @Override
            public String toString() {
                return "Service [\naccountID: " + super.getAccountID() + "\nnumberOfItems: " + numberOfItems
                        + "\npricePerItem: " + pricePerItem + "]";
            }
        }

    }

}