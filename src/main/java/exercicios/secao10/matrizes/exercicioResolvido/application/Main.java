package exercicios.secao10.matrizes.exercicioResolvido.application;

public class Main
{
	/*
	Fazer um programa para ler um número inteiro N e uma matriz de
	ordem N contendo números inteiros. Em seguida, mostrar a diagonal
	principal e a quantidade de valores negativos da matriz
	 */

	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Qual será o tamanho da matriz? ");
		int n = sc.nextInt();
		System.out.println();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				System.out.print("Digite o valor da posição [" + i + ", " + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Diagonal principal:");
		for (int i = 0; i < mat.length; i++)
		{
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				if (mat[i][j] < 0)
				{
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("Quantidade de valores negativos: " + count);

		sc.close();
	}
}
