package demo_deletar_dados.application;

import demo_deletar_dados.db.DB;
import demo_deletar_dados.db.DbIntegrityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program
{
	public static void main(String[] args0)
	{
		Connection conn = null;
		PreparedStatement st = null;

		try
		{
			conn = DB.getConnection();
			st = conn.prepareStatement(
				"DELETE FROM department "
					+ " WHERE "
					+ "(Id = ?)");

			st.setInt(1, 2);

			int rowsAffected = st.executeUpdate();
			System.out.println("Rows affected: " + rowsAffected);
		}
		catch (SQLException e)
		{
			throw new DbIntegrityException(e.getMessage());
		}
		finally
		{
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
