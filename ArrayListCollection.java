import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");
        System.out.print("Exibir o conteúdo da lista com um loop controlado por contador:");

        for(int i=0; i<items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }

        display(items, "%nExibir o conteúdo da lista com a instrução for aprimorada:");

        items.add("green");
        items.add("yellow");
        display(items, "Lista com dois novos elementos:");

        items.remove("yellow");
        display(items, "Remove a primeira instancia de yellow");

        items.remove(1);
        display(items, "Remove o segundo elemento da lista (green)");

        System.out.printf("\"red\" %s está na lista%n", items.contains("red") ? "" : "not");

        System.out.printf("Tamanho: %s%n", items.size());
    }

    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);

        for(String item : items){
            System.out.printf(" %s", item);
        }

        System.out.println();
    }
}
