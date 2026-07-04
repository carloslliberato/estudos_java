package Exercicios;

import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {
        String nome, sobrenome;
        int dia, mes, ano;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("%nDigite o seu nome: ");
            nome = input.nextLine();
            System.out.print("Digite o seu sobrenome: ");
            sobrenome = input.nextLine();
            System.out.print("Digite o seu dia de nascimento: ");
            dia = input.nextInt();
            System.out.print("Digite o seu mes de nascimento: ");
            mes = input.nextInt();
            System.out.print("Digite o seu ano de nascimento: ");
            ano = input.nextInt();
        }
        HeartRate pessoa = new HeartRate(nome, sobrenome, dia, mes, ano);

        System.out.printf("%n%nNome: %s%nData de Nascimento: %d/%d/%d%nIdade: %d%n",
            pessoa.getNomeCompleto(),
            pessoa.getDia(),
            pessoa.getMes(),
            pessoa.getAno(),
            pessoa.calculaIdade()
        );

        System.out.printf("=== Fequencias Cardiacas ===%nAlvo Minimo: %.1f%nAlvo Maximo: %.1f%n",
            pessoa.calculaAlvo_Minima(),
            pessoa.calculaAlvo_Maxima()
        );

    }
}
