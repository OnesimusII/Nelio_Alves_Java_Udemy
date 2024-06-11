package secao13.composicao.exercicioFixacao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.w3c.dom.ls.LSOutput;
import secao13.composicao.exercicioFixacao.entities.enums.OrderStatus;

public class Order
{
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	public Order()
	{
	}

	public Order(Date moment, OrderStatus status, Client client)
	{
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment()
	{
		return moment;
	}

	public void setMoment(Date moment)
	{
		this.moment = moment;
	}

	public OrderStatus getStatus()
	{
		return status;
	}

	public void setStatus(OrderStatus status)
	{
		this.status = status;
	}

	public List<OrderItem> getItems()
	{
		return items;
	}

	public void addItem(OrderItem item)
	{
		items.add(item);
	}

	public void removeItem(OrderItem item)
	{
		items.remove(item);
	}

	public Double total()
	{
		Double total = 0.0;
		for (OrderItem item : items)
		{
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("\n");
		sb.append("Order items:\n");
		for (OrderItem item : items)
		{
			sb.append(item + "\n");
		}
		sb.append("\n");
		sb.append("Total price: $" + total());
		return sb.toString();
	}
}
