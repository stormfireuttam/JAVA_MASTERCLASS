import java.util.ArrayList;

public class Sale {

    private Billing billing;
    private ArrayList<Product> products;

    public Sale(Billing billing, ArrayList<Product> products) {
        this.billing = billing;
        this.products = products;
    }

    public double getDiscountPercentage(){
        return billing.getDiscount();
    }

    public double calculateCost() {
        double total = 0;
        for(int i=0; i<products.size();i++){
            total = total+products.get(i).getPrice();
        }
        total = total - (getDiscountPercentage()/100)*total;
        return total;
    }
}