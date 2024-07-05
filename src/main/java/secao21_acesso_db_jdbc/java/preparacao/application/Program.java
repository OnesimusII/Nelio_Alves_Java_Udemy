package secao21_acesso_db_jdbc.java.preparacao.application;

import java.sql.Connection;

import secao21_acesso_db_jdbc.java.preparacao.db.DB;

public class Program
{
	public static void main(String[] args0)
	{
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}
