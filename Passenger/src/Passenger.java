abstract class Passenger implements Eater {

    private String name;

    private int birthYear;

    private double weight;

    private double height;

    private char gender;

    private int numCarryOn;

    private int caloriesConsumed;

    private int caloriesAccumulator;

    public Passenger() {

        name = "";

        birthYear = 1900;

        weight = 0.0;

        height = 0.0;

        gender = 'u';

        numCarryOn = 0;

        caloriesConsumed = 0;

        caloriesAccumulator= 0;

    }

    public Passenger(String n, int b, double w, double h, char g, int c, int o, int a) {

        name = n;

        birthYear = b;

        if(w < 0) {

            weight = -1.0;

        }else {

            weight = w;

        }

        if(h < 0) {

            height = -1.0;

        }else {

            height = h;

        }

        if(g != 'm' && g != 'f') {

            gender = 'u';

        }

        else {

            gender = g;

        }

        if(c < 0) {

            numCarryOn = 0;

        }

        if(c > 0 && c <= 2){

            numCarryOn = c;

        }

        if(c > 2) {

            numCarryOn = 2;

        }

        caloriesConsumed = o;

        caloriesConsumed++;

        caloriesAccumulator = a;

    }

    public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {

        this.name = name;

        this. birthYear = birthYear;

        this.weight = weight;

        this.height = height;

        this.gender = gender;

        this.numCarryOn = numCarryOn;

    }

    public double calculateBMI() {

        double BMI;

        BMI = (weight * 703)/(Math.pow(height, 2));

        return BMI;

    }

    public int calculateAge(int currYear){

        if(currYear < birthYear)

            return -1;

        return currYear - birthYear;

    }

    public void gainWeight(){

        weight = weight + 1;

    }

    public void gainWeight(double w){

        if((weight + w) >= 0){

            weight = weight + w;

        }else {

            weight = 0;

        }

    }

    public int getBirthYear() {

        return birthYear;

    }

    public char getGender(){

        return gender;

    }

    public String getName() {

        return name;

    }

    public double getWeight() {

        return weight;

    }

    public double getHeight() {

        return height;

    }

    public int getNumCarryOn() {

        return numCarryOn;

    }

    public int getCaloriesConsumed() {

        return caloriesConsumed;

    }

    public int getCaloriesAccumulator() {

        return caloriesAccumulator;

    }

    public boolean isFemale() {

        if(gender =='f')

            return true;

        return false;

    }

    public boolean isMale() {

        if(gender=='m')

            return true;

        else

            return false;

    }

    public void loseWeight() {

        if(weight - 1<0) {

            weight = 0;

        }

        else

            weight = weight -1;

    }

    public void loseWeight(double w) {

        if((weight - w) <= 0){

            weight= 0;

        }

        else{

            weight = weight - w;

        }

    }

    public void printDetails() {

        System.out.printf( "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",name,birthYear,weight,height,gender,numCarryOn);

    }

    public void setGender(char c){

        if(c!='m'&& c!='f')

            gender='u';

        else

            gender = c;

    }

    public void setName(String n){

        name = n;

    }

    public void setBirthYear(int y){

        birthYear = y;

    }

    public void setWeight(double w){

        if(w < 0)

            weight = -1;

        else

            weight = w;

    }

    public void setHeight(double z) {

        if(z < 0) {

            height = -1;

        }

        else

            height = z;

    }

    public void setCaloriesConsumed(int c) {

        c = caloriesConsumed;

    }

    public void setCaloriesAccumulator(int a) {

        a = caloriesAccumulator;

    }

    @Override

    public String toString() {

        return String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",name,birthYear,weight,height,gender,numCarryOn);

    }

    @Override

    public boolean equals(Object obj) {

        Passenger p = (Passenger) obj;

        if(this.birthYear == p.birthYear && this.gender == p.gender && this.name == p.name) {

            if((this.weight - p.weight <= 0.5) && (this.height - p.height <= 0.5)) {

                return true;

            }

        }

        return false;

    }

    public void setNumCarryOn(int co) {

        if(co<0){

            numCarryOn = 0;

        }

        if(co>0 && co<=2){

            numCarryOn = co;

        }

        if(co>2){

            numCarryOn = 2;

        }

    }

}