package account.application;

import account.entities.Account;
import account.entities.BusinessAccount;
import account.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        
        Account acc =  new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING
        Account acc1 = bacc; // BusinessAccount eh um Account
        // BusinessAccount bacc1 = acc2 // Erro: Account não é um BusinessAccount
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 5000.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
        
        // DOWNCASTING
        // BusinessAccount bacc1 = acc2; // Erro: Account não é um BusinessAccount
        BusinessAccount bacc1 = (BusinessAccount) acc2;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc4 = (BusinessAccount) acc3;
            acc4.loan(200);
            System.out.println("LOAN");
        }

        
    }
}
