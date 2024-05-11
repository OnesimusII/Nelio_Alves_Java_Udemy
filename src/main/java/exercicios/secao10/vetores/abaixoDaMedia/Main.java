package exercicios.secao10.vetores.abaixoDaMedia;

public class Main
{
	/*
	Problema "abaixo_da_media"
	Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
	mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
	os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
	*/

	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();

		while (n <= 0)
		{
			System.out.print("Digite um número maior que 0. ");
			System.out.print("Tente novamente: ");
			n = sc.nextInt();
		}

		double[] vect = new double[n];

		for (int i = 0; i < n; i++)
		{
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += vect[i];
		}

		System.out.println();
		double avg = sum / n;
		System.out.printf("Média do vetor: %.3f%n", avg);
		System.out.println();
		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < n; i++)
		{
			if(vect[i] < avg)
			{
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}
}
