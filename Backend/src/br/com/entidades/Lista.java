package br.com.entidades;

import java.util.ArrayList;

public class Lista {
	
	private long idLista;
	private Viewer viewer;
	private ArrayList<Movie> movies;
	private String listName;
	private Movie movie;
	private long IdViewer;
	private long IdMovie;
	
	public Lista () {
		idLista = 0;
		viewer = null;
		movies = null;
		listName = "";
		movie = new Movie();
	}

	public Lista(long idList, Viewer viewer, ArrayList<Movie> movies, String listName, Movie movie) {
		this.idLista = idList;
		this.viewer = viewer;
		this.movies = movies;
		this.listName = listName;
		this.movie = movie;
	}

	public long getIdList() {
		return idLista;
	}

	public void setIdList(long idList) {
		this.idLista = idList;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public Viewer getViewer() {
		return viewer;
	}

	public void setViewer(Viewer viewer) {
		this.viewer = viewer;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Lista [idLista=" + idLista + ", viewer=" + viewer + ", movies=" + movies + ", listName=" + listName
				+ ", movie=" + movie + ", IdViewer=" + IdViewer + ", IdMovie=" + IdMovie + "]";
	}

	public long getIdViewer() {
		return IdViewer;
	}

	public void setIdViewer(long idViewer) {
		IdViewer = idViewer;
	}

	public long getIdMovie() {
		return IdMovie;
	}

	public void setIdMovie(long idMovie) {
		IdMovie = idMovie;
	}
	
	
	
}
