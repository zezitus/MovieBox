package Telinhas;

import java.sql.Date;

import br.com.connexion.DirectorDAO;
import br.com.connexion.ListDAO;
import br.com.connexion.MovieDAO;
import br.com.connexion.UserDAO;
import br.com.connexion.ViewerDAO;
import br.com.entidades.Director;
import br.com.entidades.List;
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
		 // user.setIdUser(2);
		 // user.setName("Vanessa");
		 //  user.setEmail("vanessa@gmail.com");
		 //  user.setPassword("22222");
		 //  user.setGender("F");
		 //  user.setBirthday("20/02/2002)
		   
		//	UserDAO userDAO = new UserDAO();
		//	userDAO.edit(user); 
//==========================================================================================
//	    UserDAO userDAO = new UserDAO();
//	    User user = userDAO.searchID(3);
//	    System.out.println(user);
//==========================================================================================
		//UserDAO userDAO = new UserDAO();
		//userDAO.drop(0);
//==========================================================================================
		
//		Viewer viewer = new Viewer();
//		viewer.getIdViewer();
//		viewer.setUserName("Vanzi");
//		viewer.setIdUser(3);
//		viewer.setIdDirector();
//		ViewerDAO viewerDAO = new ViewerDAO();
//		viewerDAO.add(viewer); 
//============================================================================================
	     
//		List list = new List ();
//		list.getIdList();
//		list.setListName("Terror");
//		list.getIdViewer();
//		list.getIdMovie();
//		ListDAO listDAO = new ListDAO();
//		listDAO.add(list);
		
//=============================================================================================
	
	Movie movie = new Movie();
	movie.getIdMovie();
	movie.setTitle("Sherk2");
	movie.setGender("Animação, comédia");
	movie.setCast("jdiasjdiasjdiaj");
	movie.setDescription("Um filme sobre um ogro e uma princesa ogra indo visitar seus pais");
	movie.setIdDirector(1);
	movie.setDuration("240 min");
	movie.setAvaliation(5);
	movie.setRecommendedAge(18);
	MovieDAO movieDAO = new MovieDAO();
	movieDAO.add(movie);
	
//================================================================================================
	
//	Director director = new Director();
//	director.getIdDirector();
//	director.setDirectorName("Luciano Hulk");
//	director.setIdUser(1);
//	DirectorDAO directorDAO = new DirectorDAO();
//	directorDAO.add(director);
//=================================================================================================
	}	//testar editar

}
