package secao18.exercicioFixacao.entities;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Contract
{
	private Integer contractNumber;

	private Date contractDate;

	private Double contractValue;

	private List<Installment> installments;

	public Contract(Integer contractNumber, Date contractDate, Double contractValue)
	{
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractValue = contractValue;
	}
}
