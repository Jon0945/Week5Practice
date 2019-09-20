package Se.Lexicon.John;

import Se.Lexicon.John.interfaces.Action;
import Se.Lexicon.John.models.Product;

public class App
{
    public static void main( String[] args ) { }
    Product[] products = new Product[5];

    public class findEmptyStock implements Action {
        @Override
        public void execute(Product p) {
            for (Product x: products) {
                if (x.getStock() <=0) {
                    System.out.println(x);
                }
            }
        }
    }

    public class printBProducts implements Action {
        @Override
        public void execute(Product p) {
            for (Product x: products) {
                if (x.getProductname().charAt(0) == 'B') {
                    System.out.println(x);
                }
            }
        }
    }

    public class findPriceRange implements Action {
        @Override
        public void execute(Product p) {
            for (Product x: products) {
                if (x.getPrice()>100 & x.getPrice()<150) {
                    System.out.println(x);
                }
            }
        }

    }

    public class increseStockPrice implements Action {
        @Override
        public void execute(Product p) {
            for (Product x: products) {
                if (x.getStock()<10 & x.getPrice()>0) {
                    x.setPrice((x.getPrice()*1.5));
                }
            }
        }

    }
}
}
