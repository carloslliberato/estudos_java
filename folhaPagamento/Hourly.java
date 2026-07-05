package folhaPagamento;
import java.math.BigDecimal;
public class Hourly extends Employeed {
    private BigDecimal wage;
    private double hours;

    public Hourly(BigDecimal wage, double hours){
        if(wage.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours worked must be > 0.0 and < 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(BigDecimal wage){
        
    }
}
