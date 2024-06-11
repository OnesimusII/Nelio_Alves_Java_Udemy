package exercicios.secao10.vetores.aprovados;

import java.util.Scanner;

public class Main
{
	/*
	Problema "aprovados"
	Fazer um programa para ler um conjunto de nomes de alunos, bem como as notas que eles tiraram no
	primeiro e segundo semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois,
	imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja
	superior ou igual a 6,0 (seis).
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos você quer cadastrar? ");
		int n = sc.nextInt();

		if (n <= 0)
		{
			System.out.println(
				"O professor digitou um número menor/igual a 0. O programa será encerrado.");
			System.exit(0);
		}

		String[] names = new String[n];
		double[] firstSemesterGrades = new double[n];
		double[] secondSemesterGrades = new double[n];

		for (int i = 0; i < names.length; i++)
		{
			System.out.println("Digite o nome do " + (i + 1) + "ª aluno: ");
			sc.nextLine();
			names[i] = sc.nextLine();
			System.out.print("Digite a nota do primeiro semestre do aluno " + names[i] + ": ");
			firstSemesterGrades[i] = sc.nextDouble();
			System.out.print("Digite a nota do segundo semestre do aluno " + names[i] + ": ");
			secondSemesterGrades[i] = sc.nextDouble();
			System.out.println();
		}

		System.out.println();
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < names.length; i++)
		{
			// utilizando o método isStudentApproved para verificar se o aluno foi aprovado
			// passando as notas do primeiro e segundo semestre como argumentos
			// se o método retornar true, o aluno foi aprovado
			if (isStudentApproved(firstSemesterGrades[i], secondSemesterGrades[i]))
			{
				System.out.println(names[i]);
			}
		}
	}

	private static boolean isStudentApproved(double firstSemesterGrade, double secondSemesterGrade)
	{
		return ((firstSemesterGrade + secondSemesterGrade) / 2) >= 6;
	}
}
