package exercicios.secao10.vetores.application;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

		/*
		Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		 */

		Scanner sc = new Scanner(System.in);

		String initMsg = "Quantos números você quer digitar?";
		int n;

		do
		{
			System.out.println(initMsg);
			n = sc.nextInt();

			if (n <= 0 || n > 10)
			{
				System.out.print("Digite um número que esteja entre 0 e 10. ");
				System.out.println("Tente novamente:");
			}
		} while (n <= 0 || n > 10);


		int[] vect = new int[n];

		for (int i = 0; i < n; i++)
		{
			System.out.println("Digite o " + (i + 1) + "º número:");
			vect[i] = sc.nextInt();
		}

		System.out.println("Números negativos digitados:");
		for (int i = 0; i < n; i++)
		{
			if(vect[i] < 0)
			{
				System.out.println(vect[i]);
			}
		}
	}
}
