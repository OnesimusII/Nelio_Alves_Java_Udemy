package secao19_generics_set_map.map.demo1.application;

import java.util.Map;
import java.util.TreeMap;

public class Program
{
	public static void main(String[] args0)
	{
		/*

		Map<K,V>

		• https://docs.oracle.com/javase/10/docs/api/java/util/Map.html
		• É uma coleção de pares chave / valor
		• Não admite repetições do objeto chave
		• Os elementos são indexados pelo objeto chave (não possuem posição)
		• Acesso, inserção e remoção de elementos são rápidos
		• Uso comum: cookies, local storage, qualquer modelo chave-valor

		• Principais implementações:

		• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
		• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
		  compareTo do objeto (ou Comparator)
		• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados

		Alguns métodos importantes:

		• put(key, value), remove(key), containsKey(key), get(key)

		• Baseado em equals e hashCode
		• Se equals e hashCode não existir, é usada comparação de ponteiros

		• clear()
		• size()
		• keySet() - retorna um Set<K>
		• values() - retornaa um Collection<V>

		 */

		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		cookies.remove("email");
		cookies.put("phone", "99771133");
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet())
		{
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
