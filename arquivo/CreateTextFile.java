package arquivo;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateTextFile {
    private static  Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile(){
        try {
            output = new Formatter("clientes.txt");
        } catch (SecurityException securityException) {
            System.err.println("Permissão de escrita negada. Encerrando.");
            System.exit(1);
        }catch (FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir arquivo. Encerrando.");
            System.exit(1);
        }
    }

    public static void addRecords(){
        try(Scanner input = new Scanner(System.in)){
            System.out.printf("%n%n%s%n%s%n? ",
                "Insira o número da conta, o nome, o sobrenome e o saldo.",
                "Insira o indicador de fim de arquivo para encerrar a entrada."
            );

            while(input.hasNext()){
                try{
                    output.format("%d %s %s %.2f%n",
                        input.nextInt(),
                        input.next(),
                        input.next(),
                        input.nextDouble()
                    );
                }catch(FormatterClosedException formatterClosedException){
                    System.err.println("Erro ao escrever no arquivo. Encerrando.");
                    break;
                }
                catch(NoSuchElementException elementExceptioin){
                    System.err.println("Entrada inválida. Tente novamente.");
                    input.nextLine();
                }

                System.out.print("? ");
            }
        }
    }

    public static void closeFile(){
        if(output != null){
            output.close();
        }
    }
}
