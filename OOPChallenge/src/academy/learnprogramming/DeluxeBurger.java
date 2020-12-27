package academy.learnprogramming;

class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "White","Sausage And Bacon",  359);
        super.addOn1("Chips", 20);
        super.addOn2("ColdDrink", 35);
    }

    @Override
    public void addOn1(String name, double price) {
        System.out.println("Cannot add any more items");
    }

    @Override
    public void addOn2(String name, double price) {
        System.out.println("Cannot add any more items");
    }

    @Override
    public void addOn3(String name, double price) {
        System.out.println("Cannot add any more items");
    }

    @Override
    public void addOn4(String name, double price) {
        System.out.println("Cannot add any more items");
    }
}
