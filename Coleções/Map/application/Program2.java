package Coleções.Map.application;

import java.util.HashMap;
import java.util.Map;

import generics.exercicio.entities.Product;

public class Program2 {
    public static void main(String[] args) {
        Map<Product, Double> estoque = new HashMap<>();
        
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        estoque.put(p1, 1000.00);
        estoque.put(p2, 2000.00);
        estoque.put(p3, 300.00);

        Product ps = new Product("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + estoque.containsKey(ps));
                
    }
}
