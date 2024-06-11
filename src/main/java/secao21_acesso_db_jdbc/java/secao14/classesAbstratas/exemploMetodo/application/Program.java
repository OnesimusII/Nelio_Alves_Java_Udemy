package secao14.classesAbstratas.exemploMetodo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import secao14.classesAbstratas.exemploMetodo.entities.Circle;
import secao14.classesAbstratas.exemploMetodo.entities.Rectangle;
import secao14.classesAbstratas.exemploMetodo.entities.Shape;
import secao14.classesAbstratas.exemploMetodo.entities.enums.Color;

public class Program
{
	/*
	Fazer um programa para ler os dados de N figuras (N fornecido
	pelo usuário), e depois mostrar as áreas destas figuras na
	mesma ordem em que foram digitadas.
	 */

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		List<Shape> list = new ArrayList<>();
		for (int i = 1; i <= n; i++)
		{
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();

			if (ch == 'r')
			{
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();

				list.add(new Rectangle(width, height, Color.valueOf(color)));
			}
			else
			{
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(radius, Color.valueOf(color)));
			}
			System.out.println();
		}

		System.out.println("SHAPE AREAS:");
		for (Shape shape : list)
		{
			System.out.println(String.format("%.2f", shape.area()));
		}
	}
}
