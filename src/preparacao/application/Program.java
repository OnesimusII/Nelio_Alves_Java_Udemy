package preparacao.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import preparacao.db.DB;

public class Program
{
	public static void main(String[] args0)
	{
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}
