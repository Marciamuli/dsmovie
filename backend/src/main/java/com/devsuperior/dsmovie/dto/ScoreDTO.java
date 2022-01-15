package com.devsuperior.dsmovie.dto;

public class ScoreDTO {
	
	private Long moviesId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}

	public Long getMoviesId() {
		return moviesId;
	}

	public void setMoviesId(Long moviesId) {
		this.moviesId = moviesId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	

}
