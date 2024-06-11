package secao18_interfaces.exercicioFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import secao18_interfaces.exercicioFixacao.entities.Contract;
import secao18_interfaces.exercicioFixacao.entities.Installment;
import secao18_interfaces.exercicioFixacao.services.ContractService;
import secao18_interfaces.exercicioFixacao.services.PayPalService;

public class Program
{	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the contract data: ");
		System.out.print("Enter the contract number: ");
		int contractNumber = sc.nextInt();
		sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter the contract date: ");
		Date contractDate = sdf.parse(sc.nextLine());
		System.out.print("Enter the contract value: ");
		double contractValue = sc.nextDouble();

		Contract contract = new Contract(contractNumber, contractDate, contractValue);

		System.out.println();
		System.out.print("Enter the number of installments: ");
		int monthQuantity = sc.nextInt();
		sc.nextLine();

		ContractService contractService = new ContractService(new PayPalService());

		contractService.processContract(contract, monthQuantity);

		System.out.println();
		System.out.println("Parcelas: ");
		for(Installment installment : contract.getInstallments())
		{
			System.out.println(installment);
		}

		sc.close();
	}
}
