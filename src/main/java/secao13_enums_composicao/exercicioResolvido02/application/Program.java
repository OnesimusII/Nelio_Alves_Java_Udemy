package secao13.composicao.exercicioResolvido02.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import secao13.composicao.exercicioResolvido02.entities.Comment;
import secao13.composicao.exercicioResolvido02.entities.Post;

public class Program
{
	/*
	Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
	na tela do terminal, conforme exemplo
	 */
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Exercicio resolvido 02");
		System.out.println("Instanciando objetos manualmente");

		System.out.print("How many posts do you want to create? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		Post[] posts = new Post[n];

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter post #" + (i + 1) + " data:");
			System.out.print("Date(dd/MM/yyyy HH:mm:ss): ");
			Date moment = sdf.parse(sc.nextLine());
			System.out.print("Title: ");
			;
			String title = sc.nextLine();
			System.out.print("Content: ");
			String content = sc.nextLine();
			System.out.print("Likes: ");
			int likes = sc.nextInt();
			sc.nextLine();
			System.out.println();
			posts[i] = new Post(moment, title, content, likes);
		}

		System.out.println();
		System.out.print("How many comments do you want to add? ");
		int nComments = sc.nextInt();
		sc.nextLine();
		System.out.println();

		for (int i = 0; i < nComments * posts.length; i++)
		{
			System.out.println("Enter comment #" + (i + 1) + " data:");
			System.out.print("Enter post number (1-" + (n) + "): ");
			int postNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter comment text: ");
			String text = sc.nextLine();
			System.out.println();
			posts[postNumber - 1].addComment(new Comment(text));
		}

		System.out.println();
		System.out.println("Posts:");
		System.out.println();
		for (int i = 0; i < n; i++)
		{
			System.out.println(posts[i]);
		}
	}
}
