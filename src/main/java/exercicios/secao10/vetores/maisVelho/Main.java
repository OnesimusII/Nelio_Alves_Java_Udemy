package exercicios.secao10.vetores.maisVelho;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{
	/*
	Problema "mais_velho"
	Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
	devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
	da pessoa mais velha.
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você quer cadastrar? ");
		int n = sc.nextInt();

		if (n <= 0)
		{
			System.out.println(
				"O usuário digitou um número menor ou igual a 0 e o programa será encerrado.");
			System.exit(0);
		}

		String[] names = new String[n];
		int[] ages = new int[n];

		for (int i = 0; i < n; i++)
		{
			System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
			names[i] = sc.next();
			System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
			ages[i] = sc.nextInt();
		}

		/*

		Comentei essas três linhas pois sei que é possível fazer dessa forma mais eficiente,
		pois já atuo como desenvolvedor Java há 2 anos.

		Porém, a nível didático para alguém que não trabalha,
		nesse ponto do curso (provavelmente não saberia como fazer dessa forma.)

		System.out.println("A pessoa mais velha é: " + names[IntStream.range(0, ages.length)
			.filter(i -> ages[i] == Arrays.stream(ages).max().getAsInt()).findAny().getAsInt()]);

		 */

		int oldestAge = ages[0];
		int indexOfOldestAge = 0;
		for (int i = 0; i < n; i++)
		{
			if (ages[i] > oldestAge)
			{
				oldestAge = ages[i];
				indexOfOldestAge = i;
			}
		}

		System.out.println("A pessoa mais velha é: " + names[indexOfOldestAge]);
	}
}
