package secao19_generics_set_map.tipoCuringaDelimitados.problema1.application;

import java.util.ArrayList;
import java.util.List;
import secao19_generics_set_map.tipoCuringaDelimitados.problema1.entities.Circle;
import secao19_generics_set_map.tipoCuringaDelimitados.problema1.entities.Rectangle;
import secao19_generics_set_map.tipoCuringaDelimitados.problema1.entities.Shape;

public class Program
{
	public static void main(String[] args0)
	{
		/*
		Curingas delimitados (bounded wildcards)
		Vamos fazer um método para retornar a soma das áreas de uma lista de
		figuras.

		Nota 1: soluções impróprias:

		public double totalArea(List<Shape> list)
		public double totalArea(List<?> list)

		Nota 2: não conseguiremos adicionar elementos na lista do método
		 */

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
