package academy.learnprogramming;

public class Bed {
    private String style;
    private int pillows, height, sheets, quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts)
    {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make()
    {
        System.out.println("Bed ==> Making");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }
}
