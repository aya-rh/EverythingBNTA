package Parts;

import products.IProduct;

public interface IPart extends IProduct {
   // properties added on to ones inherited from IProduct
    String getManufacturer();
    Long getPartNumber();
    void setManufacturer(String manufacturer);
    void setPartNumber(long number);


}
