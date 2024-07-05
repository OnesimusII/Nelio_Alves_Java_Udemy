package exercicios.secao10.vetores.numerosPares;

import java.util.Scanner;

public class Main
{
	/*
		Problema "numeros_pares"
		Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		tela todos os números pares, e também a quantidade de números pares.
		 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();

		if(n <= 0)
		{
			System.out.println("Usuário digitou um número menor/igual a 0 e o programa será encerrado.");
			System.exit(0);
		}
		else
		{
			int[] vect = new int[n];

			for (int i = 0; i < vect.length; i++)
			{
				System.out.print("Digite o " + (i + 1) + "º número: ");
				vect[i] = sc.nextInt();
			}

			System.out.println("Números pares digitados:");
			int count = 0;
			for (int i = 0; i < vect.length; i++)
			{
				if(vect[i] % 2 == 0)
				{
					System.out.print(vect[i] + " ");
					count++;
				}
			}

			System.out.println();
			System.out.println();
			System.out.println("Quantidade de números pares digitados: " + count);
		}

	}
}
