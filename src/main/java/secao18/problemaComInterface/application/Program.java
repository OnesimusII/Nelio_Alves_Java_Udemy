package secao18.problemaComInterface.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import secao18.problemaComInterface.entities.CarRental;
import secao18.problemaComInterface.entities.Vehicle;
import secao18.problemaComInterface.services.BrazilTaxService;
import secao18.problemaComInterface.services.RentalService;

/*
Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas.
Porém, se a duração da locação ultrapassar 12 horas,  a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos.
 */
public class Program
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

		System.out.println();
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(carRental);

		System.out.println();
		System.out.println("FATURA:");
		System.out.println(String.format("Pagamento básico: $%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println(String.format("Imposto: $%.2f", carRental.getInvoice().getTax()));
		System.out.println(String.format("Pagamento total: $%.2f", carRental.getInvoice().getTotalPayment()));

		sc.close();
	}
}
