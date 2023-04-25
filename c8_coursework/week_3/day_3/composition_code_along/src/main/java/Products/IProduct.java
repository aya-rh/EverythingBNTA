package Products;

public interface IProduct {

    float getPrice();
    long getInventory();
    void setPrice(float price);
    void setInventory(long amount);
    void setTitle(String title);
    String getTitle();
    void addInventory(long amount);
    void removeInventory(long amount);

    //anything that returns something, you put into the brackets and set return type as void



}
