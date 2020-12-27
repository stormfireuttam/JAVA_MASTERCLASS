import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Shop {
    Product[] shopProducts;
    Sale newSale;
    Scanner in = new Scanner(System.in);

    public void initilaizeProducts(){
        shopProducts = new Product[10];
        shopProducts[0] = new Product("Rice", 10);
        shopProducts[1] = new Product("Sugar", 8);
        shopProducts[2] = new Product("Pasta", 2);
        shopProducts[3] = new Product("Coffee", 3);
        shopProducts[4] = new Product("Tea", 3);
        shopProducts[5] = new Product("Banana", 10);
        shopProducts[6] = new Product("Onion", 8);
        shopProducts[7] = new Product("Cucumber", 2);
        shopProducts[8] = new Product("Carrot", 3);
        shopProducts[9] = new Product("Chilly", 3);
    }

    public void startBilling(){
        System.out.print("Enter date:(dd/mm/yyyy): ");
        String date = in.next();
        try {
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            System.err.println("Error in date entry");
        }

        ArrayList<Product> scannedProducts = new ArrayList<Product>();
        System.out.println("PRODUCTS");
        for(int i=0;i<shopProducts.length;i++){
            System.out.println(" "+(i+1)+". "+shopProducts[i].getName()+" $"+shopProducts[i].getPrice());
        }
        System.out.println(" "+(shopProducts.length+1)+". Exit");
        int choice;
        do{
            System.out.print("Enter choice: ");
            choice = in.nextInt();
            if(choice<1 || choice>(shopProducts.length))
                break;
            scannedProducts.add(shopProducts[choice-1]);
        }while(choice>0 && choice<(shopProducts.length+1));

        System.out.println("Select billing");
        System.out.println("1. Loyalty Billing");
        System.out.println("2. Normal Billing");
        System.out.println("3. Seasonal Billing");
        System.out.println("4. Sale Billing");
        choice = in.nextInt();
        switch(choice){
            case 1:
                newSale = new Sale(new LoyaltyBilling(), scannedProducts);
                break;
            case 2:
                newSale = new Sale(new NormalBilling(), scannedProducts);
                break;
            case 3:
                newSale = new Sale(new SeasonalBilling(), scannedProducts);
                break;
            case 4:
                newSale = new Sale(new SaleBilling(), scannedProducts);
                break;
            default:
                System.out.println("Invalid entry");
        }

        System.out.printf("Total Cost: $%.2f",newSale.calculateCost());
    }

    public static void main(String[] args) {
        Shop s = new Shop();
        s.initilaizeProducts();
        s.startBilling();
    }
}