package Vehicles;

import Products.IProduct;

public class Car extends Vehicle implements ILandVehicle, IMotorised{

    private IMotorised engine;


    public Car(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine){
        super(weight, maxSpeed, baseProduct);
        this.engine = engine;
        wheelCount = 4;
    }

    @Override
    public int getWheelCount(){
        return wheelCount();
    }
    @Override
    public int setWheelCount(int count){
        this.wheelCount = count;
    }

    @Override
    public float getPrice(float price) {
        return 0;
    }

    @Override
    public long getInventory(long amount) {
        return 0;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public void setFuelLevel(int level) {

    }

    @Override
    public int getFuelLevel() {
        return 0;
    }
}
