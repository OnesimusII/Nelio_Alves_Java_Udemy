package exercicios.secao10.vetores.maiorPosicao;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{
	/*
	Problema "maior_posicao"
	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
	o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
	considerando a primeira posição como 0 (zero).
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vect[i] = sc.nextDouble();
		}


		/*
		Comentei essas três linhas pois sei que é possível fazer dessa forma mais eficiente,
		pois já atuo como desenvolvedor Java há 2 anos.

		Porém, a nível didático para alguém que não trabalha,
		nesse ponto do curso (provavelmente não saberia como fazer dessa forma.)

		System.out.println("O maior número do vetor é: " + Arrays.stream(vect).max().getAsDouble());

		System.out.println("A posição do maior número é: " + IntStream.range(0, vect.length)
			.reduce((i, j) -> vect[i] > vect[j] ? i : j)
			.getAsInt());
		 */

		double biggestValue = vect[0];
		int indexOfBiggestValue = 0;
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] > biggestValue)
			{
				biggestValue = vect[i];
				indexOfBiggestValue = i;
			}
		}

		System.out.println("O maior número do vetor é: " + biggestValue);
		System.out.println("A posição do maior número é: " + indexOfBiggestValue);

	}
}
