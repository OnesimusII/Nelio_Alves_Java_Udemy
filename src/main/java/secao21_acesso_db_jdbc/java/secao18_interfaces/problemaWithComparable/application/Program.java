package secao18_interfaces.problemaWithComparable.application;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import secao18_interfaces.problemaWithComparable.entities.Employee;

/*
Outro problema

Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato .csv, armazenando-os em uma lista.
Depois, ordenar a lista por nome e mostrar o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

Maria Brown,4300.00
Alex Green,3100.00
Bob Grey,3100.00
Anna White,3500.00
Alex Black,2450.00
Eduardo Rose,4390.00
Willian Red,2900.00
Marta Blue,6100.00
Alex Brown,5000.00
 */
public class Program
{
	public static void main(String[] args0)
	{
		File file = new File("D:\\temp\\in.txt");
		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] employeeCsv = line.split(",");
				employees.add(new Employee(employeeCsv[0], Double.parseDouble(employeeCsv[1])));
			}

			Collections.sort(employees);
			for(Employee employee : employees)
			{
				System.out.println(employee);
			}
		}
		catch(IOException e)
		{
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
