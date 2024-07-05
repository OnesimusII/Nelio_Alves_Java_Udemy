package secao20_prog_funcional_exp_lambda.funcoesRecebemFuncoes.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import secao20_prog_funcional_exp_lambda.funcoesRecebemFuncoes.entities.Product;

public class ProductService
{
	public double filteredSum(List<Product> products, Predicate<Product> criterio)
	{
		double sum = 0.0;
		for (Product product : products)
		{
			if (criterio.test(product))
			{
				sum += product.getPrice();
			}
		}
		return sum;
	}
}
