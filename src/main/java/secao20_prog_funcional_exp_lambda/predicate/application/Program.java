package secao20_prog_funcional_exp_lambda.predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import secao20_prog_funcional_exp_lambda.predicate.entities.Product;
import secao20_prog_funcional_exp_lambda.predicate.utils.ProductPredicate;

public class Program
{
	/*
	Problema exemplo

	Fazer um programa que, a partir de uma lista de produtos, remova da
	lista somente aqueles cujo preço mínimo seja 100.
	 */
	public static void main(String[] args) {

		double min = 100.0;

		// Implementação da Interface
		List<Product> list = criaLista();
		list.removeIf(new ProductPredicate());
		for (Product p : list) {
			System.out.println(p);
		}
		System.out.println();

		// Reference method com método estático
		list = criaLista();
		list.removeIf(Product::staticProductPredicate);
		for (Product p : list) {
			System.out.println(p);
		}
		System.out.println();

		// Reference method com método NÃO estático
		list = criaLista();
		list.removeIf(Product::nonStaticProductPredicate);
		for (Product p : list) {
			System.out.println(p);
		}
		System.out.println();

		// Expressão Lambda declarada
		list = criaLista();
		Predicate<Product> predicate = p -> p.getPrice() >= min;
		list.removeIf(predicate);
		for (Product p : list) {
			System.out.println(p);
		}
		System.out.println();

		// Expressão Lambda inline
		list = criaLista();
		list.removeIf(p -> p.getPrice() >= min);
		for (Product p : list) {
			System.out.println(p);
		}
	}

	private static List<Product> criaLista()
	{
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		return list;
	}
}
