package secao19_generics_set_map.tipoCuringaDelimitados.problema2;

import java.util.ArrayList;
import java.util.List;

public class Covariancia
{
	public static void main(String[] args0)
	{
		/*
		Princípio get/put - covariância
		 */

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		// Erro de compilacao
		//list.add(20);
	}
}
