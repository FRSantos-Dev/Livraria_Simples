package br.com.NostraLibrary.livraria.testes;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.LibraryNostra.livraria.Author;
import br.com.LibraryNostra.livraria.produtos.Book;
import br.com.LibraryNostra.livraria.produtos.phsysicalBook;

public class NewsJava8 {

	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Rodrigo Turini");

		Book javaoo = new phsysicalBook(author);
		javaoo.setName("Java O.O.");
		
		Book java8 = new phsysicalBook(author);
		java8.setName("Java 8 Prático");

		Book ruby = new phsysicalBook(author);
		ruby.setName("Livro de Ruby");
		
		List<Book> books = Arrays.asList(javaoo, java8, ruby);
		
		books.sort(comparing(l -> l.getName()));
		
		books.forEach(l -> System.out.println(l.getName()));
		
		List<Book> filters = new ArrayList<>();
		for (Book book : books) {
			if (book.getName().contains("Java")) {
				filters.add(book);
			}
		}
		
		for (Book book : filters) {
			System.out.println(book.getName());
		}

		books.stream()
			.filter(l -> l.getName().contains("Java"))
			.forEach(l -> System.out.println(l.getName()));		
		
		Stream<String> names = books.stream().map(Book::getName);
		
		books.stream()
			.map(l -> l.getName())
			.filter(n -> n.contains("Java"))
			.forEach(n -> System.out.println(n));
		
		books.stream()
			.map(Book::getName)
			.filter(n -> n.contains("Java"))
			.findFirst()
			.ifPresent(System.out::println);
	}
}
