package exercicios.secao10.vetores.alturas.application;

import exercicios.secao10.vetores.alturas.entities.Person;
import java.util.Scanner;

public class Main
{
	/*
	Problema "alturas"
	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
	tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
	bem como os nomes dessas pessoas caso houver.
	*/

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você quer cadastrar? ");
		int n = sc.nextInt();

		if (n <= 0)
		{
			System.out.println("Usuário digitou um número menor/igual a 0 e o programa será encerrado.");
		}
		else
		{
			Person[] persons = new Person[n];

			for (int i = 0; i < persons.length; i++)
			{
				persons[i] = new Person();

				System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
				persons[i].setName(sc.next());

				System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
				persons[i].setAge(sc.nextInt());

				System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
				persons[i].setHeight(sc.nextDouble());

				System.out.println();
			}

			double totalHeights = 0;
			int youngestSexteen = 0;
			for (int i = 0; i < n; i++)
			{
				totalHeights += persons[i].getHeight();
				if (persons[i].getAge() < 16)
				{
					youngestSexteen++;
				}
			}

			System.out.printf("Altura média: %.2fm %n", totalHeights / persons.length);
			System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",
				((double) youngestSexteen / persons.length) * 100);

			if (youngestSexteen > 0)
			{
				System.out.println("Pessoas com menos de 16 anos:");
				for (int i = 0; i < persons.length; i++)
				{
					if (persons[i].getAge() < 16)
					{
						System.out.println(persons[i].getName());
					}
				}
			}
			else
			{
				System.out.println("Nenhuma pessoa com menos de 16 anos foi cadastrada.");
			}
		}

	}
}
