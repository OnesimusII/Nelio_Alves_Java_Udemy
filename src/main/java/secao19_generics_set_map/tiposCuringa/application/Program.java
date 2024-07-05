package secao19_generics_set_map.tiposCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program
{
	public static void main(String[] args0)
	{

		/*
		Generics são invariantes
		List<Object> não é o supertipo de qualquer tipo de lista:
		Erro de compilação

		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		 */

		// O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		/*
		Com tipos curinga podemos fazer métodos
		que recebem um genérico de "qualquer tipo":
		 */
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);


		/*
		Porém não é possível adicionar dados a uma
		coleção de tipo curinga pois o compilador não
		sabe qual é o tipo específico do qual a lista foi instanciada.
		 */
		List<?> list = new ArrayList<Integer>();
		// Erro de compilação
		/*
			list.add(3);
		 */
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
