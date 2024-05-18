package secao14.classesAbstratas.exercicioFixacao.entities;

public class PessoaFisica extends Contribuinte
{
	private Double gastosSaude;

	public PessoaFisica()
	{
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude)
	{
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude()
	{
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude)
	{
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto()
	{
		if (rendaAnual < 20000.0)
		{
			return rendaAnual * 0.15 - gastosSaude * 0.5;
		}
		else
		{
			return rendaAnual * 0.25 - gastosSaude * 0.5;
		}
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}
