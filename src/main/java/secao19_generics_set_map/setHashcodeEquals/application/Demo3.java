package secao19_generics_set_map.setHashcodeEquals.application;

import java.util.HashSet;
import java.util.Set;
import secao19_generics_set_map.genericosDelimitados.entities.Product;

public class Demo3
{
	/*
	Como as coleções Hash testam igualdade?

	- Se hashCode e equals estiverem implementados:
	• Primeiro hashCode. Se der igual, usa equals para confirmar.

	Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode

	- Se hashCode e equals NÃO estiverem implementados:
	• Compara as referências (ponteiros) dos objetos.

	 */
	public static void main(String[] args)
	{
		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}
}
