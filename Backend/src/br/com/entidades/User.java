package br.com.entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class User {

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", gender=" + gender + ", birthday="
				+ birthday + ", email=" + email + ", password=" + password + "]";
	}

	private long idUser;
	private String name;
	private String gender;
	private String birthday;
	private String email;
	private String password;
	
	public User() {
		idUser = 0;
		name = "";
		gender = "";
		birthday = null;
		email = "";
		password = "";
	}
	
	public User(long idUser, String name, String gender, String birthday, String email, String password) {
		this.idUser = idUser;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.password = password;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean authentication (String password) {
		if (this.password.equals(password)) {
			return true;
		} else {return false;}
	}
	
}
