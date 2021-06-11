package br.com.connexion;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.entidades.List;
import br.com.entidades.Movie;
import br.com.entidades.User;

import br.com.connexion.MovieDAO;

public class ListDAO {
	
	private ConexaoMysql conexao;
	
	public ListDAO() {
		this.conexao = new ConexaoMysql(BDSetting.IP, BDSetting.DOOR, BDSetting.LOGIN, BDSetting.PASSWORD, BDSetting.NAMEBD);

	}
	
	public ListDAO(ConexaoMysql conexao) {
		super();
		this.conexao = conexao;
	}

	public ConexaoMysql getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoMysql conexao) {
		this.conexao = conexao;
	}
	
	public void add(List list) {
		this.conexao.OpenConnection();
		String sql =  "INSERT INTO lista VALUES (null, ?, ?, ?)";
		try {
			PreparedStatement  st = conexao.getConexao().prepareCall(sql);
			st.setString(1, list.getListName());
			st.setLong(2, list.getIdViewer());
			st.setLong (3, list.getIdMovie());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.conexao.CloseConnection();
		}
	}
	
	public void edit (List list) {
		this.conexao.OpenConnection();
		String sql = "UPDATE director SET nome_lista =?,  id_filme =? WHERE id_lista=?";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, list.getListName());
			st.setLong(2, list.getMovie().getIdMovie());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.conexao.CloseConnection();
		}
	}
	
	public void drop (Long id_list) {
		this.conexao.OpenConnection();
		String sql = "DELETE FROM lista WHERE id_lista =?";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_list);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List searchId (Long id_list) {
		this.conexao.OpenConnection();
		String sql = "SELECT * FROM lista WHERE id_lista=? ;";  
		List list = null;
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_list);
			ResultSet rs = st.executeQuery();
		    if (rs.next()) {
		        list = new List();
		        list.setIdList(rs.getLong("id_lista"));
		        list.setListName(rs.getString("nome_da_lista"));
		        MovieDAO movieDAO = new MovieDAO();
		        Movie movie = (Movie) movieDAO.searchID(rs.getLong("id_filme"));
		        list.setMovie(movie);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
}
