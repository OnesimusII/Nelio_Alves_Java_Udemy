package secao18_interfaces.problemaSemInterface.services;

import java.time.Duration;
import secao18_interfaces.problemaSemInterface.entities.CarRental;
import secao18_interfaces.problemaSemInterface.entities.Invoice;

public class RentalService
{
	private Double pricePerHour;
	private Double pricePerDay;
	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService)
	{
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental)
	{
		double locationHours = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes() / 60.0;
		double locationDays = Duration.between(carRental.getStart(), carRental.getFinish()).toHours() / 24.0;
		double basicPayment;


		if(locationHours <= 12)
		{
			basicPayment = Math.ceil(locationHours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(locationDays) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
