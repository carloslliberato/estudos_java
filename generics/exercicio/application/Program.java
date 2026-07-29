package generics.exercicio.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import generics.exercicio.entities.Product;
import generics.exercicio.services.CalculationService;

public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        String path = "c:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("Most Expensive: ");
            System.out.println(x.getName() + ", " + x.getPrice());
        }
        catch(IOException e){
            System.out.println("Erro ao ler o arquivo.");
        }
    }
}
