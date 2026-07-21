import java.time.LocalDate;
public class EmployeeTest {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(2006,7,1);
        LocalDate hire = LocalDate.of(2026,10,2);
        Employee employee1 = new Employee("Carlos", "Liberato", birth, hire);
        Employee employee2 = new Employee("Aleatorio", "Aleatorio", birth, hire);
        Employee employee3 = new Employee("Aleatorio", "Aleatorio", birth, hire);
        Employee employee4 = new Employee("Aleatorio", "Aleatorio", birth, hire);

        System.out.println(employee1);
        System.out.printf("Quantidade de funcionários: %d%n",Employee.getCount());
        System.out.printf("Quantidade de funcionários e1: %d%n",employee1.getCount());
        System.out.printf("Quantidade de funcionários e2: %d%n",employee2.getCount());
        System.out.printf("Quantidade de funcionários e3: %d%n",employee3.getCount());
        System.out.printf("Quantidade de funcionários e3: %d%n",employee4.getCount());
    }
}
