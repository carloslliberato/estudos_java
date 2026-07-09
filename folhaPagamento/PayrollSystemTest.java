package folhaPagamento;

public class PayrollSystemTest {
    public static void main(String[] args) {
        Salaried salaried = new Salaried("Carlos", "Luciano", "111-11-111", 800.00);
        Hourly hourly = new Hourly("Leticia", "Luciano", "222-22-222", 16.40, 40);
        Commission commission = new Commission("Andre", "Luciano", "333-33-333", 10000, .06);

        System.out.println("=== Processamento Individual (Estático) ===");
        System.out.printf("%s%nearned: $%,.2f%n%n", salaried, salaried.earning());
        System.out.printf("%s%nearned: $%,.2f%n%n", hourly, hourly.earning());
        System.out.printf("%s%nearned: $%,.2f%n%n", commission, commission.earning());

        Employee[] employees = new Employee[3];
        employees[0] = salaried;
        employees[1] = hourly;
        employees[2] = commission;

        System.out.println("=================================================");
        System.out.println("=== Processamento Polimórfico (Dinâmico) ===");
        System.out.println("=================================================");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            System.out.printf("Ganhos: %s%n%n", currentEmployee.earning());
        }
        
    }
}
