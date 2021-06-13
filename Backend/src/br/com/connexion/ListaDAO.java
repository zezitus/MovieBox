package br.com.connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entidades.Lista;
import br.com.entidades.Movie;

public class ListaDAO {
	
	private ConexaoMysql conexao;
	
	public ListaDAO() {
		this.conexao = new ConexaoMysql(BDSetting.IP, BDSetting.DOOR, BDSetting.LOGIN, BDSetting.PASSWORD, BDSetting.NAMEBD);

	}
	
	public ListaDAO(ConexaoMysql conexao) {
		super();
		this.conexao = conexao;
	}

	public ConexaoMysql getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoMysql conexao) {
		this.conexao = conexao;
	}
	
	public void add(Lista list) {
		this.conexao.OpenConnection();
		String sql =  "INSERT INTO lista VALUES (null, ?, ?, ?)";
		try {
			PreparedStatement  st = conexao.getConexao().prepareCall(sql);
			st.setString(1, (list).getListName());
			st.setLong(2, ( list).getIdViewer());
			st.setLong (3, (list).getIdMovie());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.conexao.CloseConnection();
		}
	}
	
	public void edit (Lista list) {
		this.conexao.OpenConnection();
		String sql = "UPDATE director SET nome_lista =?,  id_filme =? WHERE id_lista=?";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, ( list).getListName());
			st.setLong(2, (list).getMovie().getIdMovie());
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
	
	public Lista searchId (Long id_list) {
		this.conexao.OpenConnection();
		String sql = "SELECT * FROM lista WHERE id_lista=? ;";  
		Lista list = null;
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_list);
			ResultSet rs = st.executeQuery();
		    if (rs.next()) {
		        list = new Lista();
		        ((Lista) list).setIdList(rs.getLong("id_lista"));
		        ((Lista) list).setListName(rs.getString("nome_da_lista"));
		        MovieDAO movieDAO = new MovieDAO();
		        Movie movie = (Movie) movieDAO.searchID(rs.getLong("id_filme"));
		        ((Lista) list).setMovie(movie);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public List<Lista> SearchAll(){
		this.conexao.OpenConnection();
		List<Lista> ListList = new ArrayList();
		String sql = "SELECT * FROM lista";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Lista list = new Lista ();
				( (Lista) list).setIdList(rs.getLong("id_filme"));
				( (Lista) list).setListName(rs.getString("nome_da_lista"));
				( (Lista) list).setIdViewer(rs.getLong("id_viewer"));
				( (Lista) list).setIdMovie(rs.getLong("id_filme"));
				ListList.add(list);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
