package secao20_prog_funcional_exp_lambda.streams.exercicio02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import secao20_prog_funcional_exp_lambda.streams.exercicio02.entities.Employee;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.valueOf(fields[2])));
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();

			System.out.println(String.format("Email of people whose salary is more than %.2f:", salary));
			list.stream().filter(employee -> employee.getSalary() > salary)
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.map(employee -> employee.getEmail()).forEach(System.out::println);

			System.out.println(String.format("Sum of salary of people whose name starts with 'M': %.2f",
				list.stream().filter(employee -> employee.getName().charAt(0) == 'M')
					.map(employee -> employee.getSalary()).reduce(0.0, (e1, e2) -> e1 + e2)));
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
