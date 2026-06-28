import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args){     
        String name = JOptionPane.showInputDialog("What is your name?");
        Account myAccount = new Account(name, 0);
        String message = String.format("Welcome to CarlosBank, %s!", name);
        JOptionPane.showMessageDialog(null, message);

        name = JOptionPane.showInputDialog("What is your name?");
        Account myAccount2 = new Account(name,0);
        message = String.format("Welcome to CarlosBank, %s!", name);
        JOptionPane.showMessageDialog(null, message);  

        System.out.printf("%nName in object myAccount is: %s and balance is: $%.2f%n", myAccount.getName(), myAccount.getBalance());
        System.out.printf("Name in object myAccount2 is: %s and balance is: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter deposit amount for account1: ");
            double depositAmount = input.nextDouble();
            System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
            myAccount.deposit(depositAmount);
            
            System.out.printf("%s balance: $%.2f %n", myAccount.getName(), myAccount.getBalance());
            System.out.printf("%s balance: $%.2f %n", myAccount2.getName(), myAccount2.getBalance());

            System.out.print("Enter deposit amount for account2: ");
            depositAmount = input.nextDouble();
            System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
            myAccount2.deposit(depositAmount);

            System.out.printf("%s balance: $%.2f %n", myAccount.getName(), myAccount.getBalance());
            System.out.printf("%s balance: $%.2f %n", myAccount2.getName(), myAccount2.getBalance());

        }
    }
}
