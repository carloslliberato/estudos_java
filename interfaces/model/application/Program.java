package interfaces.model.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = input.nextLine();
        System.out.print("Retirada: ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), fmt);
        System.out.print("Retorno: ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), fmt);       
        

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = input.nextDouble();
        System.out.print("Entre com o preço por dia");
        double pricePerDay = input.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Inposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());
        input.close();
    }
}
