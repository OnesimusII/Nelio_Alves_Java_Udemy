package secao18_interfaces.defaultMethods.entities;

public class USAInterestService implements InterestService
{
	private double interestRate;

	public USAInterestService(double interestRate)
	{
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate()
	{
		return interestRate;
	}
}
