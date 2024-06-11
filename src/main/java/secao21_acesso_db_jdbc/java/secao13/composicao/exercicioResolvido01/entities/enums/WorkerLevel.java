package secao13.composicao.exercicioResolvido01.entities.enums;

public enum WorkerLevel
{
	JUNIOR(10),
	MID_LEVEL(20),
	SENIOR(30);

	private int value;

	WorkerLevel(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}



