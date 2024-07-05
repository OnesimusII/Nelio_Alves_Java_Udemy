package exercicios.secao10.vetores.somaVetores;

import java.util.Scanner;

public class Main
{
	/*
	Problema "soma_vetores"
	Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
	terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
	o vetor C gerado.
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos cada vetor terá? ");
		int n = sc.nextInt();

		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];

		System.out.println("Digite os elementos do vetor A:");
		for (int i = 0; i < vectA.length; i++)
		{
			System.out.print("Digite o " + (i + 1) + "º número do Vetor A: ");
			vectA[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Digite os elementos do vetor B:");
		for (int i = 0; i < vectB.length; i++)
		{
			System.out.print("Digite o " + (i + 1) + "º número do Vetor B: ");
			vectB[i] = sc.nextInt();
		}

		for (int i = 0; i < vectC.length; i++)
		{
			vectC[i] = vectA[i] + vectB[i];
		}

		System.out.println();
		System.out.println("Vetor C:");
		for (int i = 0; i < vectC.length; i++)
		{
			System.out.println(vectC[i]);
		}

		sc.close();
	}
}
