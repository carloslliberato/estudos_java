package account.application;

import java.util.ArrayList;
import java.util.List;

import account.entities.Account;
import account.entities.BusinessAccount;
import account.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        
        List<Account> lista = new ArrayList<>();
        
        // Account acc1 = new Account(101, "Alex", 1000.00);
        Account acc1 = new SavingAccount(102, "Maria", 1000.00, 0.01);
        Account acc2 = new BusinessAccount(103, "Bob", 1000.00, 500.00);

        lista.add(acc1);
        lista.add(acc2);

        double sum = 0.0;
        for(Account acc : lista){
            sum += acc.getBalance();
        }

        System.out.println("Total balance: " + sum);
        
    }
}
