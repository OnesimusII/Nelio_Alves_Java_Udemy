package secao17.exercicioProposto.application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import secao17.exercicioProposto.entities.Product;

public class Program
{
	/*
	Fazer um programa para ler o caminho de um arquivo .csv
	contendo os dados de itens vendidos. Cada item possui um
	nome, preço unitário e quantidade, separados por vírgula. Você
	deve gerar um novo arquivo chamado "summary.csv", localizado
	em uma subpasta chamada "out" a partir da pasta original do
	arquivo de origem, contendo apenas o nome e o valor total para
	aquele item (preço unitário multiplicado pela quantidade),
	conforme exemplo.
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter the file path: ");
		Scanner sc = new Scanner(System.in);
		File sourceFile = new File(sc.nextLine());

		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile.getPath())))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] infosLine = line.split(",");

				String productName = infosLine[0];
				Double productPrice = Double.parseDouble(infosLine[1]);
				Integer productQuantity = Integer.parseInt(infosLine[2]);

				products.add(new Product(productName, productPrice, productQuantity));
			}

			boolean success = new File(sourceFile.getParent() + "\\out").mkdir();

			if ((success))
			{
				String path = sourceFile.getParent() + "\\out\\summary.csv";
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
				{
					for (Product product : products)
					{
						bw.write(product.toString());
						bw.newLine();
					}
					System.out.println(path + " CREATED!");
				}
				catch (Exception e)
				{
					if (e instanceof IOException)
					{
						System.out.println("Error writing file: " + e.getMessage());
					}
					else
					{
						e.printStackTrace();
					}
				}
			}
			else
			{
				System.out.println(
					"Não foi possível criar o diretório 'out' na pasta " + sourceFile.getParent());
			}
		}
		catch (Exception e)
		{
			if (e instanceof IOException)
			{
				System.out.println("Error: " + e.getMessage());
			}
			else
			{
				e.printStackTrace();
			}
		}
		sc.close();


/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();

 */
	}

}
