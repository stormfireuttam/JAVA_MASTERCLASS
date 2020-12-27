package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter)
    {
        if (tonerLevel >= 1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.duplexPrinter = duplexPrinter;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        if (tonerAmount >= 1 && tonerAmount <= 100)
        {
            if (this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages)
    {
        if (duplexPrinter)
        {
            pages = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex Mode");
        }
        this.pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
