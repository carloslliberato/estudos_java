// CLASSE 1: PackageData (A classe que tem os dados)
class PackageData {
    // Repare: NÃO tem public nem private aqui. 
    // Elas ganharam o "Acesso de Pacote" automaticamente!
    int number = 10;
    String string = "Texto Inicial";

    public String toString() {
        return "Number: " + number + " | String: " + string;
    }
}

// CLASSE 2: PackageDataTest (A classe que roda o programa)
public class PackageDataTest {
    public static void main(String[] args) {
        // Criando o objeto da outra classe
        PackageData pasta = new PackageData();
        
        System.out.println("Antes: " + pasta); // Imprime os valores iniciais

        // Como estamos no mesmo pacote, a classe Test pode MUDAR os dados DIRETAMENTE,
        // sem precisar de um método "setNumber" ou "setString".
        pasta.number = 77;          // Alteração DIRETA permitida!
        pasta.string = "Mudei o texto"; // Alteração DIRETA permitida!

        System.out.println("Depois: " + pasta); // Imprime os valores alterados
    }
}