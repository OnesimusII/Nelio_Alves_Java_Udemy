package secao13.composicao.exercicioFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import secao13.composicao.exercicioFixacao.entities.Client;
import secao13.composicao.exercicioFixacao.entities.Order;
import secao13.composicao.exercicioFixacao.entities.OrderItem;
import secao13.composicao.exercicioFixacao.entities.Product;
import secao13.composicao.exercicioFixacao.entities.enums.OrderStatus;

public class Program
{
	/*
	Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
	sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
	o instante do sistema: new Date()

	 */
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.println();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, sdf.parse(birthDate)));
		System.out.println();

		for (int i = 1; i <= n; i++)
		{
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			System.out.println();

			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(quantity, product.getPrice(), product);
			order.addItem(item);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}
}
