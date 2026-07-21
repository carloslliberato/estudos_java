import java.util.Scanner;
public class Exercice {
    public static void main(String[] args){
        int imc, pesoEmLibra, alturaEmPolegadas;
        Scanner input = new Scanner(System.in);

        pesoEmLibra = input.nextInt();
        alturaEmPolegadas = input.nextInt();
        imc = (pesoEmLibra*703)/(alturaEmPolegadas*alturaEmPolegadas);
        System.out.printf("%d", imc);

        input.close();
    }
}
