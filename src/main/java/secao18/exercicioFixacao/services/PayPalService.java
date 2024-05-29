package secao18.exercicioFixacao.services;

public class PayPalService implements OnlinePaymentService
{
	public Double interest(Double amount, Integer month)
	{
		return amount * 0.01 * month;
	}
	public Double paymentFee(Double amount)
	{
		return amount * 0.02;
	}
}
