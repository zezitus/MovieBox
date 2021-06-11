package br.com.connexion;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import br.com.entidades.User;

public class UserDAO {
	
	private ConexaoMysql conexao;
	
	public UserDAO () {
		this.conexao = new ConexaoMysql(BDSetting.IP, BDSetting.DOOR, BDSetting.LOGIN, BDSetting.PASSWORD, BDSetting.NAMEBD);
	}

	public void add(User user) {
		// abrir
		this.conexao.OpenConnection();
		// inserir
		String sql =  "INSERT INTO usuario VALUES (null, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement st = conexao.getConexao().prepareCall(sql);
			st.setString (1, user.getName());
			st.setString (2, user.getEmail());
			st.setString (3, user.getPassword());
			st.setString(4, user.getGender());
			st.setString(5, user.getBirthday());
            st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.CloseConnection();
		}
	}
	
	public void edit(User user) {
		this.conexao.OpenConnection();
		String sql = "UPDATE usuario SET nome =?, email=?, senha=? WHERE id_usuario=?";
		
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, user.getName());
			st.setString(2, user.getEmail());
			st.setString(3, user.getPassword());
			st.setLong(4, user.getIdUser());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
		
	}
	
	public void drop(long id_usuario) {
		this.conexao.OpenConnection();
		String sql = "DELETE FROM usuario WHERE id_usuario =?";
		
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_usuario);
            st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
	}
	
	
	public User searchID (long id_user) {
		this.conexao.OpenConnection();
		String sql = "SELECT * FROM usuario WHERE id_usuario =? ;";
		  User user = null;
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_user);
			ResultSet rs = st.executeQuery();
		    if (rs.next()) {
		    	//significa que existe uma linha
		    	// setar cada a coluna do rs em um atributo  do objeto usuario 
		    	user = new User();
		    	user.setIdUser(rs.getLong("id_usuario"));
		    	user.setName(rs.getString("nome"));
		    	user.setEmail(rs.getString("email"));
		    	user.setPassword(rs.getString("senha"));
		    	user.setGender(rs.getString("genero"));
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.CloseConnection();
		}
		
		return user;
	}
	
     public List<User> SearchAll() {
    	 this.conexao.OpenConnection();
    	 
    	List <User> ListUser = new ArrayList();
    	
    	String sql = "SELECT * FROM usuario";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
		    	//significa que existe uma linha
		    	User user = new User();
		    	// setar cada a coluna do rs em um atributo  do objeto usuario 
		    	user.setIdUser(rs.getLong("id_usuario"));
		    	user.setName(rs.getString("nome"));
		    	user.setEmail(rs.getString("email"));
		    	user.setPassword(rs.getString("senha"));
		    	// adiciona na lista o objeto usuario que foi convertido
				ListUser.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
    	
		return ListUser;
	}
}
