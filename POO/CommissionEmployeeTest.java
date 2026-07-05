public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-222-222", 10000, .06);

        // System.out.println("Employee informatiov obstained by get methods: ");
        // System.out.printf("%n%s %s%n", "FirstName is", employee.getFirstName());
        // System.out.printf("%n%s %s%n", "LastName is", employee.getLastName());
        // System.out.printf("%n%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber());
        // System.out.printf("%n%s %s%n", "Gross sales is", employee.getGrossSales());
        // System.out.printf("%n%s %s%n", "Commission rate is", employee.getCommissionRate());

        // employee.setGrossSales(50000);
        // employee.setCommissionRate(.1);
        System.out.print(employee);

        BasePlusCommissionEmployee baseEmployee = new BasePlusCommissionEmployee("Carlos", "Liberato", "111-111-111", 99372, .09, 12000);
        System.out.print(baseEmployee);

    }
}
