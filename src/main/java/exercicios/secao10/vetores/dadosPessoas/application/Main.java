package exercicios.secao10.vetores.dadosPessoas.application;

import exercicios.secao10.vetores.dadosPessoas.person.Person;
import java.util.Scanner;

public class Main
{
	/*
	Problema "dados_pessoas"
	Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
	que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
	de homens.
	 */

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você quer cadastrar? ");
		int n = sc.nextInt();

		if (n <= 0)
		{
			System.out.println(
				"O usuário digitou um número menor/igual a 0 e o programa será encerrado.");
			System.exit(0);
		}

		Person[] people = new Person[n];

		for (int i = 0; i < people.length; i++)
		{
			people[i] = new Person();

			System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
			people[i].setHeight(sc.nextDouble());
			System.out.print("Digite o gênero da " + (i + 1) + "ª pessoa: ");
			people[i].setGender(sc.next().charAt(0));
			System.out.println();
		}

		double biggestHeight = people[0].getHeight();
		double smallestHeight = people[0].getHeight();
		double sumOfHeightsOfWomen = 0;
		int numberOfMen = 0;
		int numberOfWomen = 0;

		for (int i = 0; i < people.length; i++)
		{
			if (people[i].getHeight() > biggestHeight)
			{
				biggestHeight = people[i].getHeight();
			}
			if (people[i].getHeight() < smallestHeight)
			{
				smallestHeight = people[i].getHeight();
			}
			if (people[i].getGender() == 'F')
			{
				sumOfHeightsOfWomen += people[i].getHeight();
				numberOfWomen++;
			}
			else
			{
				numberOfMen++;
			}
		}

		System.out.println("Maior altura: " + biggestHeight);
		System.out.println("Menor altura: " + smallestHeight);
		System.out.printf("Média de altura das mulheres: %.2f", sumOfHeightsOfWomen / numberOfWomen);
		System.out.println();
		System.out.println("Número de homens: " + numberOfMen);
	}

}
