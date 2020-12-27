package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial Count of Pages Printed = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages Printed are " + pagesPrinted + " so new count of pages printed = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(3);
        System.out.println("Pages Printed are " + pagesPrinted + " so new count of pages printed = " + printer.getPagesPrinted());
    }
}
