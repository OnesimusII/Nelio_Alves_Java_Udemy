package exercicios.secao10.listas.exercicioProposto.application;

import exercicios.secao10.listas.exercicioProposto.entities.Employee;
import java.util.Scanner;

public class Main
{
	/*
	Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
	Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X.
	Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
	Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
	Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		if(n <= 0)
		{
			System.out.println("The user has digitized a number less than or equal to zero exiting the program.");
			System.exit(0);
		}

		Employee[] employees = new Employee[n];

		for(int i = 0; i < employees.length; i++)
		{
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employees[i] = new Employee(id, name, salary);
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee employee = null;
		for(Employee emp : employees)
		{
			if(emp.getId() == id)
			{
				employee = emp;
				break;
			}
		}

		if(employee == null)
		{
			System.out.println("This id does not exist! Program will be terminated.");
			System.exit(0);
		}
		else
		{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");

		for(Employee emp : employees)
		{
			System.out.println(emp);
		}

		sc.close();
	}
}
