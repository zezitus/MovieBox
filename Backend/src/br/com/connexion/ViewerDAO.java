package br.com.connexion;

import java.sql.Array;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entidades.Viewer;

public class ViewerDAO {

	private ConexaoMysql conexao;
	
	public ViewerDAO() {
		this.conexao = new ConexaoMysql(BDSetting.IP, BDSetting.DOOR, BDSetting.LOGIN, BDSetting.PASSWORD, BDSetting.NAMEBD);
	}
	
	public ViewerDAO(ConexaoMysql conexao) {
		super();
		this.conexao = conexao;
	}

	public ConexaoMysql getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoMysql conexao) {
		this.conexao = conexao;
	}
	
	public void add(Viewer viewer) {
		this.conexao.OpenConnection();
		String sql =  "INSERT INTO viewer VALUES (null, ?, ?, ?);";
		
		try {
			PreparedStatement st = conexao.getConexao().prepareCall(sql);
			st.setString(1, viewer.getUserName());
			st.setLong(2, viewer.getIdUser());
			st.setLong(3, viewer.getIdDirector());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.conexao.CloseConnection();
		}

}
	public void edit(Viewer viewer) {
		this.conexao.OpenConnection();
		String sql = "UPDATE viewer SET apelido =?  WHERE id_viewer=?";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, viewer.getUserName());
			st.executeUpdate();
			} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
	}
	
	public void drop(Long id_viewer) {
		this.conexao.OpenConnection();
		String sql = "DELETE FROM viewer WHERE id_viewer =?";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_viewer);
            st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
	}
	
	public Viewer searchID (Long id_viewer) {
		this.conexao.OpenConnection();
		String sql = "SELECT * FROM viewer WHERE id_viewer =? ;";
		  Viewer viewer = null;
		  try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setString(0, sql);
			ResultSet rs = st.executeQuery();
		    if (rs.next()) {
		    	viewer = new Viewer();
		    	viewer.setIdViewer(rs.getLong("id_viewer"));
		    	viewer.setUserName(rs.getString("apelido"));
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
		
		return viewer;
	}
	
	
	public List<Viewer> SearchAll() {
   	 this.conexao.OpenConnection();
   	 
   	List<Viewer> Listviewer = new ArrayList();
   	
   	String sql = "SELECT * FROM usuario";	
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Viewer viewer = new Viewer();
				viewer.setIdUser(rs.getLong("id_viewer"));
				viewer.setUserName(rs.getString("apelido"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
   	
   	return Listviewer;
	}
	
}
