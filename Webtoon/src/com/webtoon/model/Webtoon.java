package com.webtoon.model;

public class Webtoon {

	private String title;
	private String genre;
	private String writer;

	public Webtoon() {
		super();
	}

	public Webtoon(String title, String genre, String writer) {
		super();
		this.title = title;
		this.genre = genre;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Webtoon [title=" + title + ", genre=" + genre + ", writer=" + writer + "]";
	}
}