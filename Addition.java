
import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter first integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Sum is %d%n", (number1 + number2));

        input.close();
    }
}
