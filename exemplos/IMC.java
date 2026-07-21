import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        double imc, altura, peso; 
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite a sua altura: ");
            altura = input.nextDouble();
            System.out.print("Digite o seu peso: ");
            peso = input.nextDouble();
        }

        imc = peso / (altura*altura);

        System.out.printf("Seu IMC eh: %.2f%n", imc);
    }
}
