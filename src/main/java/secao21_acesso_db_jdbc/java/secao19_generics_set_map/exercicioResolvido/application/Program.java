package secao19_generics_set_map.exercicioResolvido.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import secao19_generics_set_map.exercicioResolvido.entities.Access;

public class Program
{
	/*
	Problema exemplo
	Um site de internet registra um log de acessos dos usuários. Um
	registro de log consiste no nome de usuário (apenas uma palavra) e o
	instante em que o usuário acessou o site no padrão ISO 8601,
	separados por espaço, conforme exemplo. Fazer um programa que leia
	o log de acessos a partir de um arquivo, e daí informe quantos usuários
	distintos acessaram o site.
	 */

	public static void main(String[] args0)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		Set<Access> listAcess = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] fields = line.split(" ");

				listAcess.add(new Access(fields[0], Instant.parse(fields[1])));
			}

			System.out.println("Total users: " + listAcess.size());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Erro: " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
