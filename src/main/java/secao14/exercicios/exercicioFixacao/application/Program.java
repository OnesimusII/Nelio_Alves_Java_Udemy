package secao14.exercicios.exercicioFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import secao14.exercicios.exercicioFixacao.entities.ImportedProduct;
import secao14.exercicios.exercicioFixacao.entities.Product;
import secao14.exercicios.exercicioFixacao.entities.UsedProduct;

public class Program
{
	/*
	Fazer um programa para ler os dados de N
	produtos (N fornecido pelo usuário). Ao final,
	mostrar a etiqueta de preço de cada produto na
	mesma ordem em que foram digitados.
	Cada produto possui nome e preço.
	Produtos importados possuem uma taxa de alfândega, e
	produtos usados possuem data de fabricação.
	Estes dados específicos devem ser
	acrescentados na etiqueta de preço conforme
	exemplo (próxima página). Para produtos
	importados, a taxa e alfândega deve ser
	acrescentada ao preço final do produto.
	Favor implementar o programa conforme
	projeto ao lado.
	 */

	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		List<Product> products = new ArrayList<>();

		for (int i = 0; i < n; i++)
		{
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (type == 'i')
			{
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			else if (type == 'u')
			{
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			else
			{
				products.add(new Product(name, price));
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : products)
		{
			System.out.println(product.priceTag());
		}

		sc.close();
	}


}
