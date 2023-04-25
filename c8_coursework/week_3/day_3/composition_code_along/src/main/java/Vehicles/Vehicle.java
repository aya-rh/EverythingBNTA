package Vehicles;

import Products.IProduct;

public abstract class Vehicle implements IVehicle, IProduct {

    private float weight;
    private int maxSpeed;
    private IProduct baseProduct;

    public Vehicle(float weight, int maxSpeed, IProduct baseProduct) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.baseProduct = baseProduct;
    }

    @Override
    public float getPrice() {
        return baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
        return baseProduct.getInventory();
    }


    @Override
    public void setPrice(float price) {
        baseProduct.setPrice(price);
    }

    @Override
    public void setInventory(long amount) {
        baseProduct.setInventory(amount);
    }

    @Override
    public void setTitle(String title) {
        baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) {
        baseProduct.removeInventory(amount);
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;

    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
