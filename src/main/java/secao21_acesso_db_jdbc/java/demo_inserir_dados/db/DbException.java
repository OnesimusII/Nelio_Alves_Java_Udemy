package secao21_acesso_db_jdbc.java.demo_inserir_dados.db;

public class DbException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	public DbException(String msg)
	{
		super(msg);
	}
}
