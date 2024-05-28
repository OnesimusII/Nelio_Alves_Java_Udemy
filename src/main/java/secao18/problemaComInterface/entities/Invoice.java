package secao18.problemaComInterface.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice
{
	private Double basicPayment;
	private Double tax;

	public Double getTotalPayment()
	{
		return getBasicPayment() + getTax();
	}
}
