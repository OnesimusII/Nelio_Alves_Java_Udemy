package secao18_interfaces.exercicioFixacao.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import secao18_interfaces.exercicioFixacao.entities.Contract;
import secao18_interfaces.exercicioFixacao.entities.Installment;

@Getter
@Setter
@AllArgsConstructor
public class ContractService
{
	private OnlinePaymentService paymentService;

	public void processContract(Contract contract, int monthQuantity)
	{
		List<Installment> installments = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getContractDate());
		Double valorParcela = (double) Math.round(contract.getContractValue() / monthQuantity);

		for(int i=0; i < monthQuantity; i++)
		{
			calendar.add(Calendar.MONTH,  1);
			double payment = valorParcela + (paymentService.interest(valorParcela, (i + 1)));
			payment += paymentService.paymentFee(payment);
			installments.add(new Installment(calendar.getTime(), payment));
		}

		contract.setInstallments(installments);
	}
}
