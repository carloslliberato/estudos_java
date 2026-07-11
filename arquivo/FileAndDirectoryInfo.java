package arquivo;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException{
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o nome do arquivo ou diretorio: ");
            Path path = Paths.get(input.nextLine());

            if(Files.exists(path)){
                System.out.printf("%n%s existe%n", path.getFileName());
                System.out.printf("%s um diretório%n",
                    Files.isDirectory(path) ? "É" : "Não é"
                );
                System.out.printf("%s um caminho absoluto%n",
                    path.isAbsolute() ? "É" : "Não é"
                );
                System.out.printf("Ultima modificação: %s%n",
                    Files.getLastModifiedTime(path)
                );
                System.out.printf("Tamanho: %s%n", Files.size(path));
                System.out.printf("Caminho: %s%n", path);
                System.out.printf("Caminho absoluto: %s%n", path.toAbsolutePath());

                if(Files.isDirectory(path)){
                    System.out.printf("%nDiretorio contem:%n");
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                    for(Path p : directoryStream){
                        System.out.println(p);
                    }
                }
            }else{
                System.out.printf("%s não existe%n", path);
            }



        }
    }
}
