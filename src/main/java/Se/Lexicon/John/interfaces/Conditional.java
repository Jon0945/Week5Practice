package Se.Lexicon.John.interfaces;

import Se.Lexicon.John.models.Product;

@FunctionalInterface
public interface Conditional {
    boolean test(Product p);
}
