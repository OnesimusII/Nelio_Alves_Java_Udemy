package secao20_prog_funcional_exp_lambda.comparator.lambda.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import secao20_prog_funcional_exp_lambda.comparator.lambda.entities.Product;

public class Program
{
	public static void main(String[] args)
	{

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Lambda 01
		/*
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		 */

		// Lambda 02
		/*
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 */

		//Lambda 03
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list)
		{
			System.out.println(p);
		}
	}
}
