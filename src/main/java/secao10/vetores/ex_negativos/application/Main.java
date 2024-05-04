package secao10.vetores.ex_negativos.application;

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

			if(n <= 0 || n > 10)
			{
				System.out.println("O número deve ser maior que 0 e menor que 10.");
			}
		}
		while (n <= 0 || n > 10);

		int[] vetor = new int[n];

		System.out.println("Digite números inteiros (positivos ou negativos):");
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Digite o número %s: ", i + 1);
			vetor[i] = sc.nextInt();
		}

		System.out.println("Número negativos encontrados: ");
		for(int i = 0; i < vetor.length; i++)
		{
			if (vetor[i] < 0)
			{
				System.out.println(vetor[i]);
			}
		}
	}}
