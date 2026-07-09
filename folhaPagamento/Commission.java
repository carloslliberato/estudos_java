package folhaPagamento;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Commission extends Employee{
    private BigDecimal grossSales;
    private BigDecimal commissionRate;
    private final Locale localBrasil = Locale.of("pt", "BR");
    private final NumberFormat formatador = NumberFormat.getCurrencyInstance(localBrasil);

    public Commission(String firstName, String lastName, String socialSecurityNumber,
        double grossSales, double commissionRate){
            super(firstName, lastName, socialSecurityNumber);

            if(commissionRate <= 0.0 || commissionRate >= 1.0){
                throw new IllegalArgumentException("Commission Rate must be >= 0.0");
            }

            if(grossSales < 0.0){
                throw new IllegalArgumentException("Gross Sales must be >= 0.0");
            }

            this.grossSales = BigDecimal.valueOf(grossSales);
            this.commissionRate = BigDecimal.valueOf(commissionRate);
        }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = BigDecimal.valueOf(grossSales);
    }

    public BigDecimal getGrossSales(){
        return this.grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = BigDecimal.valueOf(commissionRate);
    }

    public BigDecimal getCommissionRate(){
        return this.commissionRate;
    }

    @Override 
    public BigDecimal earning(){
        return getCommissionRate().multiply(getGrossSales());
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s; %s: %s",
            "commission employee", super.toString(),
            "gross sales", formatador.format(getGrossSales()),
            "commission rate", formatador.format(getCommissionRate())
        );
    }
    
}
