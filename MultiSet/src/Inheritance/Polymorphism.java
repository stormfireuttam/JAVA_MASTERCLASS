package Inheritance;


public class Polymorphism {
    public static void main(String[] args)
    {
//Create an array of type Account of size,2
        Account[] accounts=new Account[2];
//Set the objects of the Sales and services to the Account objects
        accounts[0]=new Sales(1234, 40, 10);
//Set the objects of the Sales and services to the Account objects
        accounts[1]=new Service(5678, 50, 10);
//Display the account details and sales value on console
        for(int index=0;index<accounts.length;index++)
        {
//call toString method on accounts object
            System.out.println("Account :"+accounts[index].toString());
//call calculateSales method
            System.out.println("Sales :"+accounts[index].calculateSales());
        }
    }//end of main method
}

