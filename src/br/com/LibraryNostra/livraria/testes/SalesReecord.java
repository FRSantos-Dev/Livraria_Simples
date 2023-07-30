package br.com.LibraryNostra.livraria.testes;
import java.util.List;

import br.com.LibraryNostra.livraria.Author;
import br.com.LibraryNostra.livraria.Cart;
import br.com.LibraryNostra.livraria.produtos.Ebook;
import br.com.LibraryNostra.livraria.produtos.phsysicalBook;
import br.com.LibraryNostra.livraria.produtos.Product;


public class SalesReecord {

	public static void main(String[] args) {
		
		Author autor = new Author();
		autor.setName("Mauricio Aniche");
		
		phsysicalBook fisico = new phsysicalBook(autor);
		fisico.setName("Test-Driven Development");
		fisico.setValue(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setName("Test-Driven Development");
		ebook.setValue(29.90);
		
		Cart cart = new Cart();
		
		if (fisico.apply10PercentDiscount(0.1)) {
			System.out.println("Valor agora é " + fisico.getValue());
		}
		
		cart.add(fisico);
		cart.add(ebook);
		
		System.out.println("Total " + cart.getTotal());
		
		List<Product> produtos = cart.getProducts();
		
		for (Product produto : produtos) {
			System.out.println(produto);
		}
	}

}
