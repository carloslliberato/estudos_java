package generics.introducao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Quantos valores? ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Integer value = input.nextInt();
            ps.addValue(value);
        }

        ps.print();
        input.close();
    }
}
