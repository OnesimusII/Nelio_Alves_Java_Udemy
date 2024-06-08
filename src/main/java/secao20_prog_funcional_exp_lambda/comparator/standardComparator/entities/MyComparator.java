package secao20_prog_funcional_exp_lambda.comparator.standardComparator.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}