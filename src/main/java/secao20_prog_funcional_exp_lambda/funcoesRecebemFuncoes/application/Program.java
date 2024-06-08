package secao20_prog_funcional_exp_lambda.funcoesRecebemFuncoes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import secao20_prog_funcional_exp_lambda.funcoesRecebemFuncoes.entities.Product;
import secao20_prog_funcional_exp_lambda.funcoesRecebemFuncoes.services.ProductService;

public class Program
{
	/*
	Problema exemplo

	Fazer um programa que, a partir de uma lista de produtos, gere uma
	nova lista contendo os nomes dos produtos em caixa alta.
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService productService = new ProductService();
		double sum = productService.filteredSum(list, product -> product.getName().charAt(0) == 'T');
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}
