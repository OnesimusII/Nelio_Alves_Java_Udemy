package secao20_prog_funcional_exp_lambda.streams.exercicio01.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import secao20_prog_funcional_exp_lambda.predicate.utils.ProductPredicate;
import secao20_prog_funcional_exp_lambda.streams.exercicio01.entities.Product;

public class Program
{
	/*
	Problema exemplo

	Fazer um programa que, a partir de uma lista de produtos, remova da
	lista somente aqueles cujo preço mínimo seja 100.
	 */
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.valueOf(fields[1])));
			}

			double avg =
				list.stream().map(product -> product.getPrice()).reduce(0.0, (p1, p2) -> p1 + p2)
					/ list.size();

			// Another form
			//double avg2 = list.stream().mapToDouble(Product::getPrice).sum() / list.size();

			System.out.println(String.format("Average price: %.2f", avg));
			list.stream().filter(product -> product.getPrice() < avg)
				.sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
				.map(product -> product.getName()).forEach(System.out::println);
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
