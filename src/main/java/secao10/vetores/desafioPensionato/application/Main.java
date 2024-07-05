package exercicios.secao10.vetores.desafioPensionato.application;

import exercicios.secao10.vetores.desafioPensionato.entities.Student;
import java.util.Scanner;

public class Main
{
	/*
	Problema "pensionato"
	Um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
	Fazer um programa que inicie com todos os quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10).
	Em seguida, registre o aluguel dos N estudantes.
	Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago.
	Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		Student[] students = new Student[10];

		for(int i = 0; i < n; i++)
		{
			System.out.println("Rent #" + (i + 1) + ":");
				System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			students[room] = new Student(name, email);
			System.out.println();
		}

		System.out.println("Busy rooms:");
		for(int i = 0; i < students.length; i++)
		{
			if (students[i] != null)
			{
				System.out.println(i + ": " + students[i].getName() + ", " + students[i].getEmail());
			}
		}
	}
}
