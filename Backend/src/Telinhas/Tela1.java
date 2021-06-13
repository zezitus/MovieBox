package Telinhas;

import java.util.Scanner;
//import java.awt.List;
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
	// User
	static void addUser() {
		Scanner t = new Scanner(System.in);
		User user = new User();
		user.getIdUser();
		String tValue;

		System.out.println("Digite seu nome");
		tValue = t.nextLine();
		user.setName(tValue);

		System.out.println("Digite seu e-mail");
		tValue = t.nextLine();
		user.setEmail(tValue);

		System.out.println("Digite sua senha");
		tValue = t.nextLine();
		user.setPassword(tValue);

		System.out.println("Digite seu gênero");
		tValue = t.nextLine();
		user.setGender(tValue);

		System.out.println("Digite sua data de nascimento");
		tValue = t.nextLine();
		user.setBirthday(tValue);

		UserDAO userDAO = new UserDAO();
		userDAO.add(user);
		System.out.println("Usuário adicionado!");
		t.close();
	}

	static void editUser() {
		Scanner t = new Scanner(System.in);
		User user = new User();
		String tValue;

		System.out.println("Digite seu id");
		long lValue = t.nextLong();
		user.setIdUser(lValue);

		System.out.println("Digite seu nome");
		tValue = t.next();
		user.setName(tValue);

		System.out.println("Digite seu e-mail");
		tValue = t.next();
		user.setEmail(tValue);

		System.out.println("Digite sua senha");
		tValue = t.next();
		user.setPassword(tValue);

		System.out.println("Digite seu gênero");
		tValue = t.next();
		user.setGender(tValue);

		System.out.println("Digite sua data de nascimento");
		tValue = t.next();
		user.setBirthday(tValue);

		UserDAO userDAO = new UserDAO();
		userDAO.edit(user);
		System.out.println("Usuário editado!");
		t.close();
	}

	static void searchUser() {
		Scanner t = new Scanner(System.in);
		long lValue;

		UserDAO userDAO = new UserDAO();
		System.out.println("Digite o id do usuário que procura");
		lValue = t.nextLong();
		User user = userDAO.searchID(lValue);

		System.out.println("Aqui está seu usuário");
		System.out.println(user);
		t.close();
	}

	static void deleteUser() {
		Scanner t = new Scanner(System.in);
		long lValue;

		System.out.println("Digite o id do usuário que deseja excluir");
		lValue = t.nextLong();

		UserDAO userDAO = new UserDAO();
		userDAO.drop(lValue);

		System.out.println("Usuário deletado");
		t.close();
	}

	// Viewer
	static void addViewer() {
		Scanner t = new Scanner(System.in);
		Viewer viewer = new Viewer();
		viewer.getIdViewer();
		String tValue;
		long lValue;

		System.out.println("Digite seu nome de usuário");
		tValue = t.nextLine();
		viewer.setUserName(tValue);

		System.out.println("Digite seu id de usuário");
		lValue = t.nextLong();
		viewer.setIdUser(lValue);

		System.out.println("Digite o id do seu diretor favorito");
		lValue = t.nextLong();
		viewer.setIdDirector(lValue);

		ViewerDAO viewerDAO = new ViewerDAO();
		viewerDAO.add(viewer);
		System.out.println("Viewer adicionado!");
		t.close();
	}

	static void editViewer() {
		Scanner t = new Scanner(System.in);
		Viewer viewer = new Viewer();
		long lValue;

		System.out.println("Digite seu id de viewer");
		lValue = t.nextLong();
		viewer.setIdViewer(lValue);

		viewer.setUserName(null);

		System.out.println("Digite o id do diretor favorito");
		lValue = t.nextLong();
		viewer.setIdDirector(lValue);

		ViewerDAO viewerDAO = new ViewerDAO();
		viewerDAO.edit(viewer);
		System.out.println("Viewer editado!");
		t.close();
	}

	static void searchViewer() {
		Scanner t = new Scanner(System.in);
		long lValue;

		ViewerDAO viewerDAO = new ViewerDAO();
		System.out.println("Digite o id do viewer que procura");
		lValue = t.nextLong();
		Viewer viewer = viewerDAO.searchID(lValue);

		System.out.println("Aqui está seu usuário");
		System.out.println(viewer);
		t.close();
	}

	static void deleteViewer() {
		Scanner t = new Scanner(System.in);
		long lValue;

		System.out.println("Digite o id do viewer que deseja excluir");
		lValue = t.nextLong();

		ViewerDAO viewerDAO = new ViewerDAO();
		viewerDAO.drop(lValue);

		System.out.println("viewer deletado");
		t.close();
	}

	// Lista
	static void addList() {
		Scanner t = new Scanner(System.in);
		Lista list = new Lista();
		list.getIdList();
		String tValue;
		long lValue;

		System.out.println("Digite o nome da sua lista");
		tValue = t.nextLine();
		list.setListName(tValue);

		System.out.println("Digite seu id de viewer");
		lValue = t.nextLong();
		list.setIdViewer(lValue);

		System.out.println("Adicione um filme a lista");
		lValue = t.nextLong();
		list.setIdMovie(lValue);

		ListaDAO listDAO = new ListaDAO();
		listDAO.add(list);
		System.out.println("Lista adicionado!");
		t.close();
	}

	static void editList() {
		Scanner t = new Scanner(System.in);
		Lista list = new Lista();
		list.getIdList();
		long lValue;

		list.setListName(null);

		System.out.println("Digite o id da sua lista");
		lValue = t.nextLong();
		list.setIdList(lValue);

		System.out.println("Digite o seu id viewer");
		lValue = t.nextLong();
		list.setIdViewer(lValue);

		System.out.println("Adicione um filme a lista");
		lValue = t.nextLong();
		list.setIdMovie(lValue);

		System.out.println("Digite seu id de viewer");
		lValue = t.nextLong();
		list.setIdViewer(lValue);

		ListaDAO listDAO = new ListaDAO();
		listDAO.edit(list);
		System.out.println("Lista editada");
		t.close();
	}

	static void searchList() {
		Scanner t = new Scanner(System.in);
		long lValue;

		ListaDAO listDAO = new ListaDAO();
		System.out.println("Digite o id da lista que procura");
		lValue = t.nextLong();
		Lista list = listDAO.searchId(lValue);

		System.out.println("Aqui está sua lista");
		System.out.println(list);
		t.close();
	}

	static void deleteList() {
		Scanner t = new Scanner(System.in);
		long lValue;

		System.out.println("Digite o id da lista que deseja excluir");
		lValue = t.nextLong();

		ListaDAO listDAO = new ListaDAO();
		listDAO.drop(lValue);

		System.out.println("lista deletada");
		t.close();
	}

	// Movie
	static void addMovie() {
		Scanner t = new Scanner(System.in);
		String tValue;
		long lValue;
		double dValue;

		Movie movie = new Movie();
		movie.getIdMovie();

		System.out.println("Digite o nome do seu filme");
		tValue = t.nextLine();
		movie.setTitle(tValue);

		System.out.println("Digite o gênero do seu filme");
		tValue = t.nextLine();
		movie.setGender(tValue);

		System.out.println("Digite o nome das pessoas que participaram do cast em uma única linha");
		tValue = t.nextLine();
		movie.setCast(tValue);

		System.out.println("Digite uma descrição para seu filme");
		tValue = t.nextLine();
		movie.setDescription(tValue);

		System.out.println("Digite seu id de diretor");
		lValue = t.nextLong();
		movie.setIdDirector(lValue);

		System.out.println("Digite a duração do seu filme");
		tValue = t.next();
		movie.setDuration(tValue);

		System.out.println("Qual avaliação seu filme possui?");
		dValue = t.nextDouble();
		movie.setAvaliation(dValue);

		System.out.println("Qual a classificação indicativa do seu filme?");
		tValue = t.next();
		movie.setRecommendedAge(tValue);

		MovieDAO movieDAO = new MovieDAO();
		movieDAO.add(movie);
		System.out.println("Seu filme foi adicionado");

		t.close();
	}

	static void editMovie() {
		Scanner t = new Scanner(System.in);
		String tValue;
		long lValue;

		Movie movie = new Movie();

		System.out.println("Digite o id do seu filme");
		movie.getIdMovie();

		System.out.println("Digite o nome do seu filme");
		tValue = t.nextLine();
		movie.setTitle(tValue);

		System.out.println("Digite o gênero do seu filme");
		tValue = t.nextLine();
		movie.setGender(tValue);

		System.out.println("Digite o nome das pessoas que participaram do cast em uma única linha");
		tValue = t.nextLine();
		movie.setCast(tValue);

		System.out.println("Digite uma descrição para seu filme");
		tValue = t.nextLine();
		movie.setDescription(tValue);

		System.out.println("Digite seu id de diretor");
		lValue = t.nextLong();
		movie.setIdDirector(lValue);

		System.out.println("Digite a duração do seu filme");
		tValue = t.nextLine();
		movie.setDuration(tValue);

		System.out.println("Qual avaliação seu filme possui?");
		tValue = t.nextLine();
		movie.setAvaliation(5);

		System.out.println("Qual a classificação indicativa do seu filme?");
		tValue = t.nextLine();
		movie.setRecommendedAge(tValue);

		MovieDAO movieDAO = new MovieDAO();
		movieDAO.edit(movie);
		System.out.println("Seu filme foi editado");

		t.close();
	}

	static void searchMovie() {
		Scanner t = new Scanner(System.in);
		long lValue;
		MovieDAO movieDAO = new MovieDAO();

		System.out.println("Digite o id do filme a ser procurado");
		lValue = t.nextLong();

		Movie movie = movieDAO.searchID(lValue);
		System.out.println("Aqui está seu filme");
		System.out.println(movie);

		t.close();
	}

	static void deleteMovie() {
		Scanner t = new Scanner(System.in);
		long lValue;
		MovieDAO movieDAO = new MovieDAO();

		System.out.println("Digite o id do filme a ser excluido");
		lValue = t.nextLong();

		movieDAO.drop(lValue);
		System.out.println("Seu filme foi deletado");

		t.close();
	}

	// Director
	static void addDirector() {
		Scanner t = new Scanner(System.in);
		Director director = new Director();
		String tValue;
		long lValue;

		director.getIdDirector();

		System.out.println("Digite seu nome de diretor");
		tValue = t.nextLine();
		director.setDirectorName(tValue);

		System.out.println("Digite o seu id de usuário");
		lValue = t.nextLong();
		director.setIdUser(lValue);

		DirectorDAO directorDAO = new DirectorDAO();
		directorDAO.add(director);
		System.out.println("Director adicionado!");
		t.close();
	}

	static void editDirector() {
		Scanner t = new Scanner(System.in);
		Director director = new Director();
		String tValue;
		long lValue;
		
		System.out.println("Digite seu id de diretor");
		lValue = t.nextLong();
		director.setIdDirector(lValue);
		System.out.println("Digite seu nome de diretor");
		tValue = t.nextLine();
		director.setDirectorName(tValue);

		DirectorDAO directorDAO = new DirectorDAO();
		directorDAO.edit(director);
		System.out.println("Director editado!");
		t.close();
	}

	static void searchDirector() {
		Scanner t = new Scanner(System.in);
		long lValue;
		DirectorDAO directorDAO = new DirectorDAO();

		System.out.println("Digite o id do diretor que procura");
		lValue = t.nextLong();
		Director director = directorDAO.searchID(lValue);

		System.out.println("Aqui está seu diretor");
		System.out.println(director);
		t.close();
	}

	static void deleteDirector() {
		Scanner t = new Scanner(System.in);
		long lValue;
		DirectorDAO directorDAO = new DirectorDAO();

		System.out.println("Digite o id do diretor a ser excluido");
		lValue = t.nextLong();
		directorDAO.drop(lValue);

		System.out.println("Seu diretor foi deletado");

		t.close();
	}

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		int nValue;

		System.out.println("==================");
		System.out.println(" -Menu Principal- \n 1)Adicionar \n 2)Editar \n 3)Remover \n 4)Visualizar \n 5)Sair");
		System.out.println("==================");

		nValue = t.nextInt();
		switch (nValue) {
		case 1:
			System.out.println("==================");
			System.out.println(" -Adicionar- \n 1)User \n 2)Director \n 3)Viewer \n 4)Movie \n 5)List");
			System.out.println("==================");
			nValue = t.nextInt();
			switch (nValue) {
			case 1:
				addUser();
				break;
			case 2:
				addDirector();
				break;
			case 3:
				addViewer();
				break;
			case 4:
				addMovie();
				break;
			case 5:
				addList();
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
			break;
		case 2:
			System.out.println("==================");
			System.out.println(" -Editar- \n 1)User \n 2)Director \n 3)Viewer \n 4)Movie \n 5)List");
			System.out.println("==================");
			nValue = t.nextInt();
			switch (nValue) {
			case 1:
				editUser();
				break;
			case 2:
				editDirector();
				break;
			case 3:
				editViewer();
				break;
			case 4:
				editMovie();
				break;
			case 5:
				editList();
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
			break;
		case 3:
			System.out.println("==================");
			System.out.println(" -Remover- \n 1)User \n 2)Director \n 3)Viewer \n 4)Movie \n 5)List");
			System.out.println("==================");
			nValue = t.nextInt();
			switch (nValue) {
			case 1:
				deleteUser();
				break;
			case 2:
				deleteDirector();
				break;
			case 3:
				deleteViewer();
				break;
			case 4:
				deleteMovie();
				break;
			case 5:
				deleteList();
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
			break;
		case 4:
			System.out.println("==================");
			System.out.println(" -Visualizar- \n 1)User \n 2)Director \n 3)Viewer \n 4)Movie \n 5)List");
			System.out.println("==================");
			nValue = t.nextInt();
			switch (nValue) {
			case 1:
				searchUser();
				break;
			case 2:
				searchDirector();
				break;
			case 3:
				searchViewer();
				break;
			case 4:
				searchMovie();
				break;
			case 5:
				searchList();
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
			break;
		case 5:
			System.out.println("Ok! Adeus!");
			break;
		default:
			System.out.println("Opção inválida, tente novamente.");
			break;
		}

//==========================================================================================    
//		UserDAO userDAO = new UserDAO();
//		java.util.List<User> listUser = userDAO.SearchAll();
//		System.out.println(listUser.size());
//=========================TESTE VIEWER========================================================

//============================================================================================	   
//		ViewerDAO viewerDAO = new ViewerDAO();
//		java.util.List<Viewer> listViewer = viewerDAO.SearchAll();
//		System.out.println(listViewer.size());
//=============================================================================================

//===============================================================================================
//		ListaDAO listaDAO = new ListaDAO();
//	    java.util.List<Lista> listLista = listaDAO.SearchAll();
//		System.out.println(listLista.size());
//===============================================================================================

//=================================================================================================	
//		MovieDAO movieDAO = new MovieDAO();
//		java.util.List<Movie> listMovie = movieDAO.SearchAll();
//		System.out.println(listMovie.size());
//================================================================================================

//=================================================================================================
//		DirectorDAO directorDAO = new DirectorDAO();
//		java.util.List<Director> listDirector = directorDAO.SearchAll();
//    	System.out.println(listDirector.size());

		t.close();
	}

}
