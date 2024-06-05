package secao19_generics_set_map.map.exercicioFixacao.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args0)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		Map<String, Integer> votes = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] fields = line.split(",");
				if (!votes.containsKey(fields[0]))
				{
					votes.put(fields[0], Integer.valueOf(fields[1]));
				}
				else
				{
					int qtdVotes = votes.get(fields[0]);
					votes.put(fields[0], Integer.valueOf(fields[1]) + qtdVotes);
				}
			}

		for(Map.Entry<String, Integer> vote: votes.entrySet())
		{
			System.out.println(String.format("%s: %d", vote.getKey(), vote.getValue()));
		}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
