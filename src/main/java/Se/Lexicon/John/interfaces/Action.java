package Se.Lexicon.John.interfaces;

import Se.Lexicon.John.models.Product;

@FunctionalInterface
public interface Action {
    void execute(Product p);
}
