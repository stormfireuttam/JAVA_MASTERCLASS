package academy.learnprogramming;

class Car{
    private int cylinders, wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name)
    {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine()
    {
        return "Car ==> Start Engine";
    }

    public String accelerate()
    {
        return "Car ==> Accelerate";
    }

    public String brake(){
        return "Car ==> Brakes Applied";
    }
}

class Mitsubishi extends Car{
        public Mitsubishi(int cylinders, String name)
        {
            super(cylinders, name);
        }

    @Override
    public String accelerate() {
        return "Mitsubishi ==> Accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi ==> Brakes Applied";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi ==> Start Engine";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

    }
}
