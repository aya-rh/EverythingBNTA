import vehicles.Car;
import vehicles.Boat;
import vehicles.Plane;
import vehicles.components.Engine;
import vehicles.components.Wheel;
import seasons.Day;

// classes in a package need to be imported in a Main class outside the package
// sub packages can be made in a package

public class Main {

    public static void main(String[] args) {
        Boat boat = new Boat();
        Plane plane = new Plane();
        Car car = new Car();

        Wheel wheel = new Wheel();


        Day day = Day.MONDAY;

        if (day.equals(Day.SATURDAY) || day.equals(Day.SUNDAY)){
            System.out.println("Yay, the weekend!");
        } else {
            System.out.println("Another work day..:/");
        }
    }


}
