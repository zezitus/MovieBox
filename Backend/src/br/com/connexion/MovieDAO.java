package br.com.connexion;

import java.sql.Array;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

import br.com.entidades.Movie;
import br.com.entidades.User;


public class MovieDAO {
	
	private ConexaoMysql conexao;
	
	public MovieDAO() {
		this.conexao = new ConexaoMysql(BDSetting.IP, BDSetting.DOOR, BDSetting.LOGIN, BDSetting.PASSWORD, BDSetting.NAMEBD);
	}

	public MovieDAO(ConexaoMysql conexao) {
		super();
		this.conexao = conexao;
	}

	public ConexaoMysql getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoMysql conexao) {
		this.conexao = conexao;
	}
	
	public void add(Movie movie) {
		
		this.conexao.OpenConnection();
		String sql =  "INSERT INTO filme VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = conexao.getConexao().prepareCall(sql);
			ps.setString(1, movie.getTitle());
			ps.setString(2,  movie.getGender());
			ps.setString(3, movie.getCast());
			ps.setString (4, movie.getDescription());
			ps.setLong(5, movie.getIdDirector());
			ps.setString(6, movie.getDuration());
			ps.setDouble(7, movie.getAvaliation());
			ps.setString(8, movie.getRecommendedAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.CloseConnection();
		}
		
	}

    public void edit(Movie movie) {
    	this.conexao.OpenConnection();
		String sql =  "UPDATE filme SET titulo =?, genero_filme=?, elenco =?, descricao=?, id_diretor=?, duration=?, avaliacao=?, idade_recomendada = ? WHERE id_filme=?";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, movie.getTitle());
			st.setString(2, movie.getGender());
			st.setString(3, movie.getCast());
			st.setString(4, movie.getDescription());
			st.setLong(5, movie.getIdDirector());
			st.setString(6, movie.getDuration());
			st.setDouble(7, movie.getAvaliation());
			st.setString(8, movie.getRecommendedAge());
			st.setLong(9, movie.getIdDirector());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
    }
    
    public void drop (long id_movie) {
    	
    	this.conexao.OpenConnection();
		String sql = "DELETE FROM filme WHERE id_filme =?";
		
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_movie);
            st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
    	
    }
    
    public Movie searchID (Long id_movie) {
    	this.conexao.OpenConnection();
		String sql = "SELECT * FROM filme WHERE id_filme =? ;";;
		Movie movie = null;
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			st.setLong(1, id_movie);
			ResultSet rs = st.executeQuery();
		    if (rs.next()) {
		    	//significa que existe uma linha
		    	// setar cada a coluna do rs em um atributo  do objeto usuario 
		    	movie = new Movie();
		    	movie.setIdMovie(rs.getLong("id_movie"));
		    	movie.setTitle(rs.getString("titulo"));
		    	movie.setDescription(rs.getString("descricao"));
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexao.CloseConnection();
		}
		
		return movie;
    }
    
    public List<Movie> SearchAll() {
   	 this.conexao.OpenConnection();
   	 
   	List <Movie> ListMovie = new ArrayList();
   	
   	String sql = "SELECT * FROM filme";
		try {
			PreparedStatement  st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie ();
				movie.setIdMovie(rs.getLong("id_filme"));
				movie.setTitle(rs.getString("titulo"));
				movie.setIdDirector(rs.getLong("id_diretor"));
				movie.setGender(rs.getString("genero_filme"));
				ListMovie.add(movie);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	
   	return ListMovie;
    }

    

}
