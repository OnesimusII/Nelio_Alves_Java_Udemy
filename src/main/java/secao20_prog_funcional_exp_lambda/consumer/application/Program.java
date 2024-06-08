package secao20_prog_funcional_exp_lambda.consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import secao20_prog_funcional_exp_lambda.consumer.entities.Product;
import secao20_prog_funcional_exp_lambda.consumer.utils.ProductConsumer;

public class Program
{
	/*
	Problema exemplo
	Fazer um programa que, a partir de uma lista de produtos, aumente o
	preço dos produtos em 10%.
	 */
	public static void main(String[] args) {

		// Implementação da Interface
		List<Product> list = criaLista();
		list.forEach(new ProductConsumer());
		list.forEach(System.out::println);
		System.out.println();

		// Reference method com método estático
		list = criaLista();
		list.forEach(Product::staticProductConsumer);
		list.forEach(System.out::println);
		System.out.println();

		// Reference method com método NÃO estático
		list = criaLista();
		list.forEach(Product::nonStaticProductPredicate);
		list.forEach(System.out::println);
		System.out.println();

		double factor = 1.1;

		// Expressão Lambda declarada
		list = criaLista();
		Consumer<Product> consumer = product -> {product.setPrice(product.getPrice() * factor);};
		list.forEach(consumer);
		list.forEach(System.out::println);
		System.out.println();

		// Expressão Lambda inline
		list = criaLista();
		list.forEach(product -> product.setPrice(product.getPrice() * factor));
		list.forEach(System.out::println);
		System.out.println();
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
