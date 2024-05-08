package exercicios.secao10.vetores.somaVetor.application;

import java.util.Scanner;

public class Main
{
	/*
	Problema "soma_vetor"
	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();

		while (n <= 0)
		{
			System.out.print("Digite um número maior que 0. ");
			System.out.print("Tente novamente: ");
			n = sc.nextInt();
		}

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vect[i] = sc.nextDouble();
		}

		System.out.println("Números digitados:");
		for (int i = 0; i < vect.length; i++)
		{
			System.out.println(vect[i]);
		}

		double sum = 0;
		for (int i = 0; i < vect.length; i++)
		{
			sum += vect[i];
		}

		System.out.println("Soma dos elementos: " + sum);
		System.out.printf("Média dos elementos: %.2f", (sum / vect.length));

		sc.close();
	}
}
