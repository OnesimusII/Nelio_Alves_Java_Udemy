package secao20_prog_funcional_exp_lambda.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import secao20_prog_funcional_exp_lambda.function.entities.Product;
import secao20_prog_funcional_exp_lambda.function.utils.UpperCaseName;

public class Program
{
	/*
	Problema exemplo

	Fazer um programa que, a partir de uma lista de produtos, gere uma
	nova lista contendo os nomes dos produtos em caixa alta.
	 */
	public static void main(String[] args) {

		// Implementação da Interface
		List<Product> list = criaLista();
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();

		// Reference method com método estático
		list = criaLista();
		names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();

		// Reference method com método NÃO estático
		list = criaLista();
		names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();

		// Expressão Lambda declarada
		list = criaLista();
		Function<Product, String> function = product -> {return product.getName().toUpperCase();};
		names = list.stream().map(function).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();

		// Expressão Lambda inline
		list = criaLista();
		names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();

		//Outro criado por mim
		criaLista().stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
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
