package exercicios.secao10.vetores.mediaPares;

public class Main
{
	/*
	Problema "media_pares"
	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
	aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
	digitado, mostrar a mensagem "NENHUM NUMERO PAR"
	 */

	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();

		if (n <= 0)
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

			int sum = 0;
			int count = 0;
			for (int i = 0; i < vect.length; i++)
			{
				if (vect[i] % 2 == 0)
				{
					sum += vect[i];
					count++;
				}
			}
			System.out.println();
			if (count == 0)
			{
				System.out.println("Nenhum NUMERO PAR foi digitado.");
			}
			else
			{
				System.out.printf("Média dos números pares: %.1f", (double) sum / count);
			}
		}

		sc.close();
	}
}
