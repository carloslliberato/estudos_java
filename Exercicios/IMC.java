package Exercicios;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double imc, peso, altura;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o seu peso: ");
            peso = input.nextDouble();

            System.out.print("Digite a sua altura: ");
            altura = input.nextDouble();

        }
        imc = calculadoraIMC(peso, altura);
        classificaIMC(imc);
        

    }

    public static double calculadoraIMC(double peso, double altura){
        return peso/Math.pow(altura, 2);
    }

    public static void classificaIMC(double imc){
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso normal (Saudável)";
        } else if (imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }

        System.out.printf(classificacao);
    }
}
