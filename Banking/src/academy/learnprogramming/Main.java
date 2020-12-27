package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Oriental Bank of Commerce");

        bank.addBranch("Patel Nagar");

        bank.addCustomer("Patel Nagar", "Uttam Mittal", 2851.58);
        bank.addCustomer("Patel Nagar", "Sandeep Mittal", 15651.75);

        bank.addCustomerTransaction("Patel Nagar", "Uttam Mittal", 200);
        bank.addCustomerTransaction("Patel Nagar", "Sandeep Mittal", 400);
        bank.addCustomerTransaction("Patel Nagar", "Uttam Mittal", 300);
        bank.addCustomerTransaction("Patel Nagar", "Uttam Mittal", 1000);

        bank.listCustomers("Patel Nagar", true);

        bank.addBranch("Prem Nagar");

        bank.addCustomer("Prem Nagar", "Pankaj Pal", 5000.43);
        bank.addCustomer("Prem Nagar", "Nitish Saraswat", 2651.75);

        bank.listCustomers("Prem Nagar", true);
    }
}
