public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
        double grossSales, double commissionRate, double baseSalary
    ){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salarial must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public double earnings(){
        return  this.baseSalary + (this.getCommissionRate() * this.getGrossSales());
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%n",
            "commission employee", this.getFirstName(), this.getLastName(),
            "social security number", this.getSocialSecurityNumber(),
            "gross sales", this.getGrossSales(),
            "commission rate", this.getCommissionRate(),
            "base salary", this.baseSalary
        );
    }

}
