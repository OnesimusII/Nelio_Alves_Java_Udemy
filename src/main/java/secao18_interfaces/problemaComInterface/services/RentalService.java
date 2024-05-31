package secao18_interfaces.problemaComInterface.services;

import java.time.Duration;
import lombok.AllArgsConstructor;
import secao18_interfaces.problemaComInterface.entities.CarRental;
import secao18_interfaces.problemaComInterface.entities.Invoice;

@AllArgsConstructor
public class RentalService
{
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;

	public void processInvoice(CarRental carRental)
	{
		double hours = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes() / 60.0;
		double days = Duration.between(carRental.getStart(), carRental.getFinish()).toHours() / 24.0;

		double basicPayment;

		if(hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(days) * pricePerDay;
		}

		carRental.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
	}
}
