package Se.Lexicon.John.models;

import Se.Lexicon.John.interfaces.Action;
import Se.Lexicon.John.interfaces.Conditional;

public class Product implements Action,Conditional {
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



    @Override
    public String toString () {
        return null;
    }

    @Override
    public void execute(Product p) {
        
    }

    @Override
    public boolean test(Product p) {
        return false;
    }
}
