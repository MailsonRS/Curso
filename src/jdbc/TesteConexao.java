package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao  {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:postgresql://localhost:5432/agenda";
		String usuario = "postgres";
		String senha = "123";
		
		Connection conexao = DriverManager.getConnection(url,usuario,senha);
		System.out.println("Conexao efetuada com sucesso");
		conexao.close();
	}

}
