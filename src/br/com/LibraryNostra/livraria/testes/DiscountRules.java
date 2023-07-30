package br.com.LibraryNostra.livraria.testes;
import br.com.LibraryNostra.livraria.Author;
import br.com.LibraryNostra.livraria.produtos.Ebook;
import br.com.LibraryNostra.livraria.produtos.phsysicalBook;


public class DiscountRules {

	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Rodrigo Turini");
		
		phsysicalBook livro = new phsysicalBook(author);
		livro.setValue(39.90);
	
		if (!livro.applyDiscount(0.3)){
			System.out.println("Desconto no livro não pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValue());
		}

		Ebook ebook = new Ebook(author);
		ebook.setValue(29.90);
		
		if (!ebook.applyDiscount(0.15)){
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValue());
		}
	}
}
