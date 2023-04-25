package Parts;

import products.IProduct;
import products.Product;

public class Part implements IPart{
    // 2. declare properties
    private String manufacturer;
    private long partNumber;
    private IProduct baseProduct;

    // 3. import constructors through command N, shift down to select all
    public Part(String manufacturer, long number, IProduct baseNumber) {
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.baseProduct = baseProduct;
    }

    // 1. import the methods
    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public Long getPartNumber() {
        return partNumber;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setPartNumber(long number) {
        this.partNumber = number;
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
}
