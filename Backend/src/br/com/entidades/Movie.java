package br.com.entidades;

import java.time.LocalTime;
import java.util.ArrayList;

public class Movie {
	private long idMovie;
	private int recommendedAge;
	private String title;
	private double avaliation;
	private String cast;
	private String description;
	private String gender;
	private String duration;
	private Director director;
	private long IdDirector;
	
	public Movie() {
		idMovie = 0;
		recommendedAge = 0;
		title = "";
		avaliation = 0;
		cast = null;
		description = "";
		gender = null;
		duration = null;
		director = null;
	}
	
	public Movie(int idMovie, int recommendedAge, String title, double avaliation, String cast,
			String description, String gender, String duration, Director director) {
		this.idMovie = idMovie;
		this.recommendedAge = recommendedAge;
		this.title = title;
		this.avaliation = avaliation;
		this.cast = cast;
		this.description = description;
		this.gender = gender;
		this.duration = duration;
		this.director = director;
	}

	public long getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(long idMovie) {
		this.idMovie = idMovie;
	}

	@Override
	public String toString() {
		return "Movie [idMovie=" + idMovie + ", recommendedAge=" + recommendedAge + ", title=" + title + ", avaliation="
				+ avaliation + ", cast=" + cast + ", description=" + description + ", gender=" + gender + ", duration="
				+ duration + ", director=" + director + "]";
	}

	public int getRecommendedAge() {
		return recommendedAge;
	}

	public void setRecommendedAge(int recommendedAge) {
		this.recommendedAge = recommendedAge;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getAvaliation() {
		return avaliation;
	}

	public void setAvaliation(double avaliation) {
		this.avaliation = avaliation;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public long getIdDirector() {
		return IdDirector;
	}

	public void setIdDirector(long idDirector) {
		IdDirector = idDirector;
	}

}
