
import java.math.BigDecimal;

public class OBigDecimalTest{

    public static void main(String[] args) {
        // double valor1 = 0.1;
        // double valor2 = 0.2;
        // System.out.println(valor1+valor2);

        BigDecimal valor1 = new BigDecimal("0.1");
        BigDecimal valor2 = new BigDecimal("0.2");

        BigDecimal resultado = valor1.add(valor2);

        System.out.println(resultado);
    }
}

