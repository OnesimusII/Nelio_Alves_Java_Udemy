package secao14.exercicios.exercicioFixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class UsedProduct extends Product
{
	private Date manufactureDate;

	public UsedProduct()
	{
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate)
	{
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate()
	{
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate)
	{
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return String.format("%s (used) $%.2f (Manufacture date: %s)", name, price, sdf.format(manufactureDate));
	}
}
