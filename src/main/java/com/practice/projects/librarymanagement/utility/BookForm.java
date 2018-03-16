package com.practice.projects.librarymanagement.utility;

public class BookForm {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String author;

	private String genre;

	private int publicationYear;
	public BookForm() {

	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

}
