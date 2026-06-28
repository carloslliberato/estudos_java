
// Classe Account que contém uma var de intancia name
// e method para configurar e obter seu valor
public class Account{
    private String name;
    private double balance;

    // contrutor inicializa name com nome do paramentro
    public Account(String name, double balance){

        this.name = name;
        if(balance > 0.00){
           this.balance = balance; 
        }

    }

    // method que deposita apenas uma quantia válida no saldo
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            this.balance += depositAmount;
        }
    }
    

    public double getBalance(){
        return this.balance;
    }

    // method para definir o nome do objeto
    public void setName(String name){ // void altera e não retorna
        this.name = name;
    }

    // method para recuperar o nome do objeto
    public String getName(){  // returna uma string
        return this.name;
    }
}