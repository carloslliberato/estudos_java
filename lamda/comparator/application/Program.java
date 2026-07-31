package lamda.comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lamda.comparator.entities.Product;

public class Program {
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

                
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        list.sort((p1, p2) -> p1.compareTo(p2));

        for (Product product : list) {
            System.out.println(product);
        }


    }

}