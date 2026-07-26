import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program{
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Carlos");
        list.add("Letícia");
        list.add("André");
        list.add(1,"Raquel");
        list.add(0,"Rogério");

        for(String nome : list){
            System.out.println(nome);
        }
        System.out.println("----------------------");
        list.removeIf(x -> x.charAt(0) == 'R');
        for(String nome : list){
            System.out.println(nome);
        }
        System.out.println("----------------------");

        List<String> resultado = list.stream().filter(x -> x.charAt(0) ==  'A').collect(Collectors.toList());
        for(String nome : resultado){
            System.out.println(nome);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}