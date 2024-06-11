package main.java.secao21_acesso_db_jdbc.preparacao.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.secao21_acesso_db_jdbc.preparacao.db.DB;

public class Program
{
	public static void main(String[] args0)
	{
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}
