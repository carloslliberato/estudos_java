package lamda.comparator.application;

import java.util.Comparator;

import lamda.comparator.entities.Product;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        p1.compareTo(p2);
        return 0;
    }
    
    
}
