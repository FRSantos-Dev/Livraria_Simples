package br.com.LibraryNostra.livraria.produtos;

import br.com.LibraryNostra.livraria.Author;
import br.com.LibraryNostra.livraria.exception.AuthorNullException;

public abstract class Book implements Product {

	private String name;
	private String description;
	private double value;
	private String isbn;
	private Author author;

	public Book(Author author) {
		
		if (author == null) {
			throw new AuthorNullException(
				"The author of book can't be null");
		}
		this.author = author;
		this.isbn = "000-00-00000-00-0";
	}
	
	public void showDetails() {
		System.out.println("Showing Details of Book ");
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Value: " + value);
		System.out.println("ISBN: " + isbn);	
		
		if (this.hasAuthor()) {
			author.showDetails();
		}
		System.out.println("--");
	}

	boolean hasAuthor() {
		return this.author != null;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public int compareTo(Product other) {
		
		if (this.getValue() < other.getValue()){
			return -1;
		}
		if (this.getValue() > other.getValue()){
			return 1;
		}
		return 0;
	}
}