package folhaPagamento;
import java.math.BigDecimal;
import java.util.Locale;
import java.text.NumberFormat;

public class Salaried extends Employee {

    private BigDecimal weeklySalary;
    private final Locale localBrasil = Locale.of("pt", "BR");
    private final NumberFormat formatador = NumberFormat.getCurrencyInstance(localBrasil);

    public Salaried(String firstName, String lastName, String socialSecurityNumber, BigDecimal weeklySalary){
        super(firstName, lastName, socialSecurityNumber);

        if(weeklySalary.compareTo(BigDecimal.ZERO) < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(BigDecimal NewWeeklySalary){
        if(NewWeeklySalary.compareTo(BigDecimal.ZERO) < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = NewWeeklySalary;
    }

    public BigDecimal getWeekSalary(){
        return this.weeklySalary;
    }

    @Override
    public BigDecimal earning(){
        return getWeekSalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%s",
            super.toString(), "week salary", formatador.format(this.getWeekSalary())
        );
    }
}
