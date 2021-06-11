package br.com.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql {

	private String ip;
	private String door;
	private String login;
	private String password;
	private String nameBD;
	
	private Connection conexao;
	
	public Connection getConexao() {
		return conexao;
	}
	
	public ConexaoMysql(String ip, String door, String login, String password, String nameBD) {
		
		this.ip = ip;
		this.door = door;
		this.login = login;
		this.password = password;
		this.nameBD = nameBD;
		
	}
	// Abrir conexão entre o banco de dados e o javason
	public void OpenConnection () {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String endereco = "jdbc:mysql://"+this.ip+":"+this.door+"/"+this.nameBD;
			this.conexao = DriverManager.getConnection(endereco, this.login, this.password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void CloseConnection () {
		try {
			if(this.conexao!= null || !this.conexao.isClosed()) {
				this.conexao.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
