package br.com.entidades;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Viewer extends User {

	private long idViewer;
	private ArrayList<Lista> lists;
	private String userName;
    private User user;
    private long IdUser;
    private long IdDirector;
    
	public Viewer() {
		super();
		idViewer = 0;
		lists = null;
		userName = "";
		user = new User();
	}
	
	public Viewer(long idViewer, ArrayList<Lista> lists, String userName, User user,
			long idUser, String name, String gender, String birthday, String email, String password) {
		super(idUser, name, gender, birthday, email, password);
		this.idViewer = idViewer;
		this.lists = lists;
		this.userName = userName;
		this.user = user;
	}
	
	
	@Override
	public String toString() {
		return "Viewer [idViewer=" + idViewer + ", lists=" + lists + ", userName=" + userName
				+ ", user=" + user + "]";
	}


	public ArrayList<Lista> getLists() {
		return lists;
	}

	public void setLists(ArrayList<Lista> lists) {
		this.lists = lists;
	}
	
	public long getIdViewer() {
		return idViewer;
	}

	public void setIdViewer(long idViewer) {
		this.idViewer = idViewer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		
	}

	public long getIdDirector() {
		return IdDirector;
	}

	public void setIdDirector(long idDirector) {
		IdDirector = idDirector;
	}
		
	}
	
	
