package main.java.secao21_acesso_db_jdbc.java.secao21_acesso_db_jdbc.demo_recuperar_dados.application;

import main.java.secao21_acesso_db_jdbc.java.secao21_acesso_db_jdbc.demo_recuperar_dados.db.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program
{
	public static void main(String[] args0)
	{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try
		{
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");

			System.out.println("Id | Name");
			while (rs.next())
			{
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
