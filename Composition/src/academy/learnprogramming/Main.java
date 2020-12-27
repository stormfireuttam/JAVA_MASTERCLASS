package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");

        Ceiling ceil = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Modern", true, 100);

        Room bedroom = new Room(wall1, wall2, wall3, wall4, ceil, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
