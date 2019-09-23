package Se.Lexicon.John.models;


import Se.Lexicon.John.interfaces.Action;

public class Product  {
    //Fields
    private String productname;
    private double price;
    private int stock;

    //Getters & Setters
    public String getProductname() { return productname; }
    public void setProductname(String productname) { this.productname = productname; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public Product(String productname, double price, int stock) {
        this.productname = productname;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString () {
        return null;
    }




}
