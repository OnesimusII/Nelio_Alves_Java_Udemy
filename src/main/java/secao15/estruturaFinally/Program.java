package secao15.estruturaFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

	/*
		Bloco finally

		• É um bloco que contém código a ser executado independentemente de ter
		  ocorrido ou não uma exceção.

		• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
		  recurso específico ao final do processamento.

		Sintaxe:

		try {

		}
		catch (ExceptionType e) {

		}
		finally {

		}

	 */

public class Program
{
	public static void main(String[] args)
	{
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try
		{
			sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e)
		{
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally
		{
			if (sc != null)
			{
				sc.close();
			}
		}
	}
}
