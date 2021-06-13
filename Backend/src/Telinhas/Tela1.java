package Telinhas;

import java.sql.Date;
import java.awt.List;

import br.com.connexion.DirectorDAO;
import br.com.connexion.ListaDAO;
import br.com.connexion.MovieDAO;
import br.com.connexion.UserDAO;
import br.com.connexion.ViewerDAO;
import br.com.entidades.Director;
import br.com.entidades.Lista;
import br.com.entidades.Movie;
import br.com.entidades.User;
import br.com.entidades.Viewer;

public class Tela1 { 
	//Testar adicionar
	public static void main(String[] args) {
//	   User user = new User();
//	   user.getIdUser();
//	   user.setName("Cecilia");
//	   user.setEmail("Ceilia@gmail.com");
//	   user.setPassword("22233");
//	   user.setGender("F");
//	   user.setBirthday("13/01/2004");
	   
//		UserDAO userDAO = new UserDAO();
//		userDAO.add(user); 
//=========================================================================================
//      user.setIdUser(2);
//      user.setName("Vanessa");
//      user.setEmail("vanessa@gmail.com");
//      user.setPassword("22222");
//      user.setGender("F");
//      user.setBirthday("20/02/2002)
		   
//	    UserDAO userDAO = new UserDAO();
//	    userDAO.edit(user); 
//==========================================================================================
//	    UserDAO userDAO = new UserDAO();
//	    User user = userDAO.searchID(3);
//	    System.out.println(user);
//==========================================================================================
//		UserDAO userDAO = new UserDAO();
//		userDAO.drop(4);
//==========================================================================================    
//		UserDAO userDAO = new UserDAO();
//		java.util.List<User> listUser = userDAO.SearchAll();
//		System.out.println(listUser.size());
//=========================TESTE VIEWER========================================================
//		Viewer viewer = new Viewer();
//		viewer.getIdViewer();
//		viewer.setUserName("Vanzi");
//		viewer.setIdUser(3);
//		viewer.setIdDirector();
//		ViewerDAO viewerDAO = new ViewerDAO();
//		viewerDAO.add(viewer); 
//============================================================================================
//		Viewer viewer = new Viewer();
//		viewer.getIdViewer(0);
//		viewer.setUserName(null);
//		viewer.setIdDirector(0);
//		ViewerDAO viewerDAO = new ViewerDAO();
//		viewerDAO.edit(viewer);
//============================================================================================
//		ViewerDAO viewerDAO = new ViewerDAO();
//		viewerDAO.drop(null);
//============================================================================================	
//		ViewerDAO viewerDAO = new ViewerDAO();
//		Viewer viewer = viewerDAO.searchID();
//      System.out.println(viewer);
//============================================================================================	   
//		ViewerDAO viewerDAO = new ViewerDAO();
//		java.util.List<Viewer> listViewer = viewerDAO.SearchAll();
//		System.out.println(listViewer.size());
//=============================================================================================
//		List list = new List ();
//		list.getIdList();
//		list.setListName("Terror");
//		list.setIdViewer(8);
//		list.setIdMovie(1);
//		ListDAO listDAO = new ListDAO();
//		listDAO.add(list);
//=============================================================================================
//	    List list = new List ();
//	    list.getIdList();
//	    list.setIdMovie(0);
//	    list.setListName(null);
//	    list.getIdViewer();
//	    ListDAO listDAO = new ListDAO();
//	    listDAO.edit(list);
//===============================================================================================		
//		ListDAO listDAO = new ListDAO();
//		ListDAO.drop(null);
//===============================================================================================		
//		ListDAO listDAO = new ListDAO();
//		List list = listDAO.searchID();
//		System.out.println(list);
//===============================================================================================
//		ListaDAO listaDAO = new ListaDAO();
//	    java.util.List<Lista> listLista = listaDAO.SearchAll();
//		System.out.println(listLista.size());
//===============================================================================================
//	    Movie movie = new Movie();
//	    movie.getIdMovie();
//	    movie.setTitle("Sherk2");
//	    movie.setGender("Animação, comédia");
//	    movie.setCast("jdiasjdiasjdiaj");
//	    movie.setDescription("Um filme sobre um ogro e uma princesa ogra indo visitar seus pais");
//	    movie.setIdDirector(1);
//	    movie.setDuration("240 min");
//	    movie.setAvaliation(5);
//	    movie.setRecommendedAge(18);
//	    MovieDAO movieDAO = new MovieDAO();
//	    movieDAO.add(movie);
//================================================================================================
//		Movie movie = new Movie();
//	    movie.setIdMovie(1);
//	    movie.setTitle("Noiva cadaver");
//	    movie.setGender("Animação, terror");
//	    movie.setCast("Tim burton");
//	    movie.setDescription("Victor tem que se casar com Vitória para garantir os negocios da familia, mas algo inesperado acontece");
//	    movie.setDuration("260 min");
//	    movie.setAvaliation(5);
//	    movie.setRecommendedAge("12");
//	    movie.setIdDirector(1);
//	    MovieDAO movieDAO = new MovieDAO();
//	    movieDAO.edit(movie);		
//=================================================================================================	
//		MovieDAO movieDAO = new MovieDAO();
//		MovieDAO.drop(null);
//=================================================================================================
//      MovieDAO movieDAO = new MovieDAO();
//      Movie movie = movieDAO.searchID();
//		System.out.println(movie);
//=================================================================================================	
//		MovieDAO movieDAO = new MovieDAO();
//		java.util.List<Movie> listMovie = movieDAO.SearchAll();
//		System.out.println(listMovie.size());
//================================================================================================
//	    Director director = new Director();
//	    director.getIdDirector();
//	    director.setDirectorName("Luciano Hulk");
//	    director.setIdUser(1);
//     	DirectorDAO directorDAO = new DirectorDAO();
//	    directorDAO.add(director);
//=================================================================================================
//		Director director = new Director();
//	    director.getIdDirector();
//	    director.setDirectorName("Luciano Hulk");
//     	DirectorDAO directorDAO = new DirectorDAO();	
//      directorDAO.edit(director);
//=================================================================================================
//      DirectorDAO directorDAO = new DirectorDAO();
//		DirectorDAO.drop(null);
//=================================================================================================
//      DirectorDAO directorDAO = new DirectorDAO();
//      Director director = directorDAO.searchID(null);
//      System.out.println(director);
//=================================================================================================
		DirectorDAO directorDAO = new DirectorDAO();
		java.util.List<Director> listDirector = directorDAO.SearchAll();
     	System.out.println(listDirector.size());
	}	

}
