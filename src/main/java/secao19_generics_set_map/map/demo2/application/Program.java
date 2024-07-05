package secao19_generics_set_map.map.demo2.application;

import java.util.HashMap;
import java.util.Map;
import secao19_generics_set_map.genericosDelimitados.entities.Product;

public class Program
{
	public static void main(String[] args)
	{
		Map<Product, Double> stock = new HashMap<>();
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		System.out.println("Stock size: " + stock.size());
		stock.put(ps, 900.0);
		System.out.println("Stock size: " + stock.size());
		for(Map.Entry<Product, Double> map : stock.entrySet())
		{
			if(map.getKey().getName().equals("Tv"))
			{
				System.out.println(map.getKey().getName());
				System.out.println(map.getKey().getPrice());
			}
		}
		System.out.println(stock.get("Tv"));
	}
}
