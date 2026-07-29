package hashCode;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        
        Set<Cliente> set = new TreeSet<>();

        set.add(new Cliente("carlos", "carlos@gmail.com"));
        set.add(new Cliente("leticia", "leticia@gmail.com"));
        set.add(new Cliente("andre", "andre@gmail.com"));

        for (Cliente c : set) {
            System.out.println(c);
        }
    }
}
