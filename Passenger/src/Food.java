public class Food {

    private String name;

    private int calories;

    public Food(String aName, int aCalories) {

        super();

        name = aName;

        calories = aCalories;

    }

    public void setName(String aName) {

        name = aName;

    }

    public String getName() {

        return name;

    }

    public void setCalories(int aCalories) {

        calories = aCalories;;

    }

    public int getCalories() {

        return calories;

    }

    public int hashCode() {

        final int prime = 31;

        int result = 1;

        result = prime * result + calories;

        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;

    }

    @Override

    public boolean equals(Object obj) {

        if (this == obj)

            return true;

        if (obj == null)

            return false;

        if (getClass() != obj.getClass())

            return false;

        Food other = (Food) obj;

        if (calories != other.calories)

            return false;

        if (name == null) {

            if (other.name != null)

                return false;

        } else if (!name.equals(other.name))

            return false;

        return true;

    }

    @Override

    public String toString() {

        return String.format("Food - name: %10s | calories: %4d", name, calories);

    }

}