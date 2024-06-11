package secao19_generics_set_map.setCompareTo.application;

import java.util.Set;
import java.util.TreeSet;
import secao19_generics_set_map.setCompareTo.entities.Product;

public class Program
{
	/*
	Como TreeSet compara os elementos?

	Recordando as implementações

	> Principais implementações:

	• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
	• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
	  pelo compareTo do objeto (ou Comparator)
	• LinkedHashSet - velocidade intermediária e elementos na ordem em que são
	  adicionados

	 */
	public static void main(String[] args) {
		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		for (Product p : set) {
			System.out.println(p);
		}
	}
}
