package secao15.estruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

	/*
	Estrutura try-catch

	• Bloco try
		• Contém o código que representa a execução normal do trecho de código que
            pode acarretar em uma exceção

	• Bloco catch
		• Contém o código a ser executado caso uma exceção ocorra
		• Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)
	 */

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}
}

