package secao18.exercicioFixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Installment
{
	private Date dueDate;
	private Double amount;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Installment(Date dueDate, Double amount)
	{
		this.dueDate = dueDate;
		this.amount = amount;
	}

	@Override
	public String toString()
	{
		return sdf.format(dueDate) + " - " + amount;
	}
}
