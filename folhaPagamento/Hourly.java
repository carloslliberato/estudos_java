package folhaPagamento;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Hourly extends Employee {
    private BigDecimal wage;
    private double hours;
    private final Locale localBrasil = Locale.of("pt", "BR");
    private final NumberFormat formatador = NumberFormat.getCurrencyInstance(localBrasil);

    public Hourly(String firstName, String LastName, String socialSecurityNumber
        ,double wage, double hours){
            super(firstName, LastName, socialSecurityNumber);
        if(wage < 0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours worked must be > 0.0 and < 168.0");
        }

        this.wage = BigDecimal.valueOf(wage);
        this.hours = hours;
    }

    public void setWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = BigDecimal.valueOf(wage);
    }

    public BigDecimal getWage(){
        return this.wage;
    }

    public void setHours(double hours){
        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours worked must be >=0.0 and <= 168.0");
        }

        this.hours = hours;
    }

    public double getHours(){
        return this.hours;
    }

    @Override
    public BigDecimal earning(){
        if(getHours() <= 40){
            return getWage().multiply(BigDecimal.valueOf(getHours()));
        }else{
            BigDecimal Fourty_Mult_Wage = BigDecimal.valueOf(40.0).multiply(getWage());
            BigDecimal Hours_Sub_Fourty = BigDecimal.valueOf(getHours()).subtract(BigDecimal.valueOf(40));
            BigDecimal Wage_Mult_OnePointFive = getWage().multiply(BigDecimal.valueOf(1.5));

            return (Fourty_Mult_Wage.add(Hours_Sub_Fourty)).multiply(Wage_Mult_OnePointFive);
        }
    }

    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: %s; %s: %s",
            super.toString(), "hourly wage", formatador.format(this.getWage()),
            "hours worked", this.getHours()
        );
    }

    @Override
    public double getPaymentAmount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPaymentAmount'");
    }
}
