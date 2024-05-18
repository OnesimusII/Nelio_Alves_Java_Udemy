package secao14.classesAbstratas.exercicioFixacao.entities;

public class PessoaJuridica extends Contribuinte
{
	private Integer numeroFuncionarios;

	public PessoaJuridica()
	{
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios)
	{
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios()
	{
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios)
	{
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto()
	{
		if (numeroFuncionarios > 10)
		{
			return rendaAnual * 0.14;
		}
		else
		{
			return rendaAnual * 0.16;
		}
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}
