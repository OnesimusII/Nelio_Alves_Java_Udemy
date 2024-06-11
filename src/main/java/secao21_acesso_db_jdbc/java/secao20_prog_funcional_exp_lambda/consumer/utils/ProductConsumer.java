package secao20_prog_funcional_exp_lambda.consumer.utils;

import java.util.function.Consumer;
import java.util.function.Predicate;
import secao20_prog_funcional_exp_lambda.consumer.entities.Product;

public class ProductConsumer implements Consumer<Product>
{
	@Override
	public void accept(Product product)
	{
		product.setPrice(product.getPrice() * 1.1);
	}
}
