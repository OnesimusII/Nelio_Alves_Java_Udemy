package secao13.composicao.exercicioResolvido01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import secao13.composicao.exercicioResolvido01.entities.Department;
import secao13.composicao.exercicioResolvido01.entities.HourContract;
import secao13.composicao.exercicioResolvido01.entities.Worker;
import secao13.composicao.exercicioResolvido01.entities.enums.WorkerLevel;

public class Main
{
	/*
	Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
	do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.
	 */

	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.println();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
			new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < n; i++)
		{
			HourContract contract = new HourContract();

			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			contract.setDate(sdf.parse(sc.next()));
			System.out.print("Value per hour: ");
			contract.setValuePerHour(sc.nextDouble());
			System.out.print("Duration (hours): ");
			contract.setHours(sc.nextInt());
			System.out.println();

			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String[] monthAndYear = sc.next().split("/");
		int month = Integer.parseInt(monthAndYear[0]);
		int year = Integer.parseInt(monthAndYear[1]);

		System.out.println();
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + departmentName);
		System.out.printf("Income for " + monthAndYear[0] + "/" + monthAndYear[1] + ": $%.2f",
			+worker.income(year, month));
	}
}
