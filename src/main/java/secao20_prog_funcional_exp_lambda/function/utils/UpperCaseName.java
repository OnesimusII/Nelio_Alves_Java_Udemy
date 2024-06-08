package secao20_prog_funcional_exp_lambda.function.utils;

import java.util.function.Consumer;
import java.util.function.Function;
import secao20_prog_funcional_exp_lambda.function.entities.Product;

public class UpperCaseName implements Function<Product, String>
{
	@Override
	public String apply(Product product)
	{
		return product.getName().toUpperCase();
	}
}
