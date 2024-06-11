package exercicios.secao10.matrizes.exercicioProposto;

import java.util.Scanner;

public class Main
{
	/*
	Fazer um programa para ler dois números inteiros M e N, e depois ler
	uma matriz de M linhas por N colunas contendo números inteiros,
	podendo haver repetições. Em seguida, ler um número inteiro X que
	pertence à matriz. Para cada ocorrência de X, mostrar os valores à
	esquerda, acima, à direita e abaixo de X, quando houver.
	 */

	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Quantas linhas terá a matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas terá a matriz? ");
		int n = sc.nextInt();
		System.out.println();

		int[][] mat = new int[m][n];

		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				System.out.print("Digite o valor da posição [" + i + ", " + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Digite um número da matriz: ");
		int x = sc.nextInt();

		System.out.println();
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				if(mat[i][j] == x)
				{
					System.out.println("Position [" + i + ", " + j + "]:");
					if(j > 0)
					{
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if(i > 0)
					{
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if(j < mat[i].length - 1)
					{
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if(i < mat.length - 1)
					{
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
