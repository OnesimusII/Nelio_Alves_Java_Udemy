package secao15.exercicioFixacao.application;

import java.util.Locale;
import java.util.Scanner;
import secao15.exercicioFixacao.entities.Account;
import secao15.exercicioFixacao.exceptions.AccountException;

/*
	Fazer um programa para ler os dados de uma conta bancária e depois realizar um
	saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
	ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
	saque da conta. Implemente a conta bancária conforme projeto abaixo:
	 */
public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("Enter account data:");
			System.out.println();
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);
			account.withdraw(amount);

			System.out.printf("New balance: %.2f%n", account.getBalance());
		}
		catch (AccountException e)
		{
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e)
		{
			System.out.println("Unexpected error!");
		}
	}
}
