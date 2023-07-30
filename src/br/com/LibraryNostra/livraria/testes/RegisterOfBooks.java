package br.com.LibraryNostra.livraria.testes;
import br.com.LibraryNostra.livraria.Author;
import br.com.LibraryNostra.livraria.produtos.Book;
import br.com.LibraryNostra.livraria.produtos.phsysicalBook;


public class RegisterOfBooks {

	public static void main(String[] args) {

		Author author = new Author();
		author.setName("Rodrigo Turini");
		author.setEmail("rodrigo.turini@caelum.com.br");
		author.setCpf("123.456.789.10");
		
		Book book = new phsysicalBook(author);
		book.setName("Java 8 Prático");
		book.setDescription("Novos recursos da linguagem");
		book.setValue(59.90);
		book.setIsbn("978-85-66250-46-6");
		
		book.showDetails();
		
		Author anotherAuthor = new Author();
		anotherAuthor.setName("Paulo Silveira");
		anotherAuthor.setEmail("paulo.silveira@caelum.com.br");
		anotherAuthor.setCpf("123.456.789.10");
				
		Book anotherBook = new phsysicalBook(anotherAuthor);
		anotherBook.setName("Lógica de Programação");
		anotherBook.setDescription("Crie seus primeiros programas");
		anotherBook.setValue(59.90);
		anotherBook.setIsbn("978-85-66250-22-0");
		
		anotherBook.showDetails();
	}
}