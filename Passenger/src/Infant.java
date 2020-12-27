public abstract class Infant extends Passenger {

    public class InfantToy{

        private String infantToyName;

        private int infantToyRating;

        public InfantToy(String n, int r) {

            infantToyName = n;

            infantToyRating = r;

        }

        public String toString() {

            return String.format("InfantToy: Toy Name: %20s | Rating %4d\n", infantToyName, infantToyRating);

        }

    }

    private InfantToy[]toys;

    private int numBabyToys;

    public Infant() {

        toys = new InfantToy[10];

        numBabyToys = 0;

    }

    public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {

        super(name, birthYear, weight, height, gender, numCarryOn);

        toys = new InfantToy[10];

        numBabyToys = 0;

    }

    public void addInfantToy(String name, int rating) {

        if(numBabyToys < 10) {

            InfantToy t1 = new InfantToy(name,rating);

            toys[numBabyToys++] = t1;

        }

        else

            System.out.println("toys has reached capacity of 10");

    }

    public int getNumInfantToys() {

        return numBabyToys;

    }

    public String getInfantToyName(int index) {

        if(index >= 0 && index < numBabyToys) {

            return toys[index].infantToyName;
        }
        else

            return "invalid index " + index;

    }

    public int getInfantToyRating(int index) {

        if(index >=0 && index < numBabyToys)

            return toys[index].infantToyRating;

        else

            return -1;

    }

    public String getInfantToyAsString(int index) {

        if(index >= 0 && index < numBabyToys) {

            return toys[index].toString();

        }

        else

            return "invalid index " + index;

    }

    public int getHighestInfantToyRating() {

        int max = 0;

        if(toys.length == 0)

            return 0;

        else {

            for(int i = 0; i < numBabyToys; i++) {

                if(toys[i].infantToyRating > max) {

                    max = toys[i].infantToyRating;

                }

            }

            return max;

        }

    }

    @Override

    public String toString() {

        String s = String.format("Infant: Number of Toys: %4d | Infant Toys:\n", numBabyToys);

        for(int i = 0; i < numBabyToys; i++) {

            s += toys[i].toString();

        }

        return super.toString() + s;

    }

    @Override
    public void printDetails() {

        super.printDetails();

        System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n",numBabyToys);

        for(int i = 0; i < numBabyToys; i++) {

            System.out.printf("infantToy: Toy Name: %20s | Rating %4d\\n",toys[i].infantToyName,toys[i].infantToyRating);

        }

    }
}

