package br.com.entidades;

import java.util.ArrayList;

public class Director extends User{
	

	private long idDirector;
	private ArrayList<Movie> movies;
	private String directorName;
	private User user;
	private Movie movie;
	private long IdUser;

	public Director () {
		super();
		idDirector = 0;
		movies = null;
		directorName = "";
		user = new User();
		movie = new Movie();
	}
		
	public Director(long idDirector, ArrayList<Movie> movies, String directorName, User user, Movie movie,
			long idUser, String name, String gender, String birthday, String email, String password) {
		super(idUser, name, gender, birthday, email, password);
		this.idDirector = idDirector;
		this.movie = movie;
		this.directorName = directorName;
		this.user = user;
		this.movies = movies;
	}
	
	public long getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(long idDirector) {
		this.idDirector = idDirector;
	}

	public ArrayList<Movie> getMovie() {
		return movies;
	}

	public void setMovie(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovies() {
		return movie;
	}

	public void setMovies(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Director [idDirector=" + idDirector + ", directorName=" + directorName
				+ ", user=" + user + ", IdUser=" + IdUser + "]";
	}
		
}
