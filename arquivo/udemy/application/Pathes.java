package arquivo.udemy.application;

import java.io.File;
import java.util.Scanner;

public class Pathes {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = input.nextLine();

        File path = new File(strPath);

        // Ler pastas
        File[] folders = path.listFiles(File ::isDirectory);
        System.out.println("Folders: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        // Ler nomes arquivos
        File[] files = path.listFiles(File ::isFile);
        System.out.printf("%nFiles: ");
        for(File file : files){
            System.out.println(file);
        }


        // Criar pasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        
        input.close();
    }
}
