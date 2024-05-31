package secao18_interfaces.problemaMotivador.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Problema motivador

Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

Maria Brown
Alex Green
Bob Grey
Anna White
Alex Black
Eduardo Rose
Willian Red
Marta Blue
Alex Brown
 */
public class Program
{
	public static void main(String[] args0)
	{
		List<String> list = new ArrayList<>();
		String path = "D:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String name = br.readLine();
			while (name != null)
			{
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			for (String s : list)
			{
				System.out.println(s);
			}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
