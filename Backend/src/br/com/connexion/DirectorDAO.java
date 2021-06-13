package br.com.connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entidades.Director;
import br.com.entidades.User;

public class DirectorDAO {
	
	private ConexaoMysql conexao;
	
	public DirectorDAO() {
		this.conexao = new ConexaoMysql(BDSetting.IP, BDSetting.DOOR, BDSetting.LOGIN, BDSetting.PASSWORD, BDSetting.NAMEBD);
	}
	
	public DirectorDAO(ConexaoMysql conexao) {
		super();
		this.conexao = conexao;
	}

	public ConexaoMysql getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoMysql conexao) {
		this.conexao = conexao;
	}
	
	public void add(Director director) {
		this.conexao.OpenConnection();
		String sql =  "INSERT INTO diretor VALUES (null, ?, ?)";
		try {
			PreparedStatement st = conexao.getConexao().prepareCall(sql);
			st.setString(1, director.getDirectorName());
			st.setLong(2, director.getIdUser());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.conexao.CloseConnection();
		}
	}
	
	public void edit(Director director) {
		this.conexao.OpenConnection();
		String sql = "UPDATE director SET nome_diretor =? WHERE id_viewer=?";
		try {
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, director.getDirectorName());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
	}
	
	public void drop (Long id_director) {
		this.conexao.OpenConnection();
		String sql = "DELETE FROM diretor WHERE id_diretor =?";
		try {
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_director);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
}
	public Director searchID(long id_director) {
		this.conexao.OpenConnection();
		String sql = "SELECT * FROM diretor WHERE id_diretor =? ;";
		Director director = null;
		try {
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_director);
			ResultSet rs = st.executeQuery();
		    if (rs.next()) { 
		    	director = new Director();
		    	director.setIdDirector(rs.getLong("id_diretor"));
		    	director.setDirectorName(rs.getString("nome_de_diretor"));
		    	UserDAO userDAO = new UserDAO();
                User user = userDAO.searchID(rs.getLong("id_usuario"));
                director.setUser(user);
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.CloseConnection();
		}
		return director;
	}
	
	
	public List<Director> SearchAll() {
	   	 this.conexao.OpenConnection();
	   	 
        List <Director> ListDirector = new ArrayList();
    	
    	String sql = "SELECT * FROM diretor";
    	try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Director director = new Director();
				director.setIdDirector(rs.getLong("id_diretor"));
				director.setDirectorName(rs.getString("nome_de_diretor"));
				ListDirector.add(director);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return ListDirector;
	}
}
