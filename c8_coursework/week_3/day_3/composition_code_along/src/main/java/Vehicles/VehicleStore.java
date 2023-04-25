package Vehicles;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {

    private static List<IVehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(10, 20, new Product(350,6,"BMX Pro"));

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());


        // create a car using an IProduct and IMotorised component
        Car car1 = new Car(200, 120, new Product(10000, 3, "2015 Dacia Duster"), new Engine(150, 100));

        car1.startEngine();
        System.out.println(car1.getFuelLevel());
        System.out.println(car1.getPrice());

        vehicles.add(bike1);
        vehicles.add(car1);
    }
}
