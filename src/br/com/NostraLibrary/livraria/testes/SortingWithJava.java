package br.com.NostraLibrary.livraria.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.LibraryNostra.livraria.Author;
import br.com.LibraryNostra.livraria.produtos.Ebook;
import br.com.LibraryNostra.livraria.produtos.phsysicalBook;
import br.com.LibraryNostra.livraria.produtos.Product;

public class SortingWithJava {

	public static void main(String[] args) {
		
		Author autor = new Author();
		autor.setName("Rodrigo Turini");
		
		phsysicalBook fisico = new phsysicalBook(autor);
		fisico.setName("Java 8 Prático");
		fisico.setValue(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setName("Java 8 Prático");
		ebook.setValue(29.90);
		
		List<Product> products = Arrays.asList(fisico, ebook);
		
		Collections.sort(products);

		for (Product product : products) {
			System.out.println(product.getValue());
		}
	}
}
