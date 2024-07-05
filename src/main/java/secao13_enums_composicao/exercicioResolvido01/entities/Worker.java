package secao13.composicao.exercicioResolvido01.entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import secao13.composicao.exercicioResolvido01.entities.enums.WorkerLevel;

public class Worker
{
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker()
	{
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department)
	{
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public WorkerLevel getLevel()
	{
		return level;
	}

	public void setLevel(WorkerLevel level)
	{
		this.level = level;
	}

	public Double getBaseSalary()
	{
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	public Department getDepartment()
	{
		return department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}

	public List<HourContract> getContracts()
	{
		return contracts;
	}

	public void addContract(HourContract contract)
	{
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract)
	{
		this.contracts.remove(contract);
	}

	public Double income(Integer year, Integer month)
	{
		Double income = baseSalary;
		Calendar calendar = Calendar.getInstance();

		for (HourContract contract : contracts)
		{
			calendar.setTime(contract.getDate());
			if (calendar.get(Calendar.YEAR) == year &&
				calendar.get(Calendar.MONTH) + 1 == month)
			{
				income += contract.totalValue();
			}
		}
		return income;
	}
}
