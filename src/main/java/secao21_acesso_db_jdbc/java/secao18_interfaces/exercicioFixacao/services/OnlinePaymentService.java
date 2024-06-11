package secao18_interfaces.exercicioFixacao.services;

public interface OnlinePaymentService
{
	Double interest(Double amount, Integer month);
	Double paymentFee(Double amount);
}
