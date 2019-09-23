package Se.Lexicon.John;

import Se.Lexicon.John.interfaces.Action;
import Se.Lexicon.John.interfaces.Conditional;
import Se.Lexicon.John.models.Product;

import java.util.Arrays;
import java.util.List;


public class App {


    public static void main(String[] args) {
        Product[] prod = new Product[4];
        prod[0] = new Product("Pantofflor", 125, 5);
        prod[1] = new Product("Bapelsiner", 75, 20);
        prod[2] = new Product("Äggmökar", 10, 0);
        prod[3] = new Product("Brustna drömmar", 250, 9);
        List<Product> products = Arrays.asList(prod);
        findProduct(products, System.out::println ,p -> p.getStock()<=0);
        findProduct(products, System.out::println ,p -> p.getProductname().charAt(0) == 'B');
        findProduct(products, System.out::println ,p -> p.getPrice()>100 & p.getPrice()<150);
        findProduct(products, p -> p.setPrice(p.getPrice()*1.5),p -> p.getStock()>0 & p.getStock()<10);


    }

    public static void findProduct(List<Product> products, Action action, Conditional onCondition) {
        for (Product p : products) {
            if (onCondition.test(p)) {
                action.execute((p));
            }
        }
    }
}

