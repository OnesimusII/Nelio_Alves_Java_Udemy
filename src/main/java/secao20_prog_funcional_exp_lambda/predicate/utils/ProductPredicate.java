package secao20_prog_funcional_exp_lambda.predicate.utils;

import java.util.function.Predicate;
import secao20_prog_funcional_exp_lambda.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product>
{
	@Override
	public boolean test(Product product)
	{
		return product.getPrice() >= 100.0;
	}
}
