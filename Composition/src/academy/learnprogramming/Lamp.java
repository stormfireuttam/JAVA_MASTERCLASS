package academy.learnprogramming;

public class Lamp {

    private String style;
    private boolean battery;
    private int glowRating;

    public Lamp(String style, boolean battery, int glowRating)
    {
        this.style = style;
        this.battery = battery;
        this.glowRating = glowRating;
    }

    public void turnOn()
    {
        System.out.println("Lamp is turning on");
    }

    public String getStyle() {
        return style;
    }

    public int getGlowRating() {
        return glowRating;
    }
    public boolean getBattery()
    {
        return battery;
    }
}
