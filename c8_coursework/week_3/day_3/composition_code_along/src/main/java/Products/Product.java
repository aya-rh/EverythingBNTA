package Products;

public class Product implements IProduct{
    // create properties after implementing methods otherwise the class will not do anything

    private float price;
    private long inventory;
    private String title;


    // use command N to create constructors for you
    public Product(float price,long inventory, String title) {
        this.price = price;
        this.inventory = inventory;
        this.title = title;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public long getInventory() {
        return inventory;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setInventory(long amount) {
        this.inventory = amount;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void addInventory(long amount) {
        this.inventory += amount;

    }

    @Override
    public void removeInventory(long amount) {
        if(this.inventory - amount < 0){
            return;
        }
        this.inventory -= amount;

    }
}
