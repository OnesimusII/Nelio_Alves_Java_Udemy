package secao20_prog_funcional_exp_lambda.comparator.standardComparator.application;

import java.util.ArrayList;
import java.util.List;
import secao20_prog_funcional_exp_lambda.comparator.standardComparator.entities.MyComparator;
import secao20_prog_funcional_exp_lambda.comparator.standardComparator.entities.Product;

public class Program
{
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort(new MyComparator());

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
