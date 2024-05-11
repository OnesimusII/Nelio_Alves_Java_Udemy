package exercicios.secao10.vetores.dadosPessoas.person;

public class Person
{
	private double height;
	private Character gender;

	public Person()
	{

	}

	public Person(double height, Character gender)
	{
		this.height = height;
		this.gender = gender;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public Character getGender()
	{
		return gender;
	}

	public void setGender(Character gender)
	{
		this.gender = gender;
	}
}
