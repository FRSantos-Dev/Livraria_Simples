package br.com.NostraLibrary.livraria.testes;

import java.util.Comparator;

import br.com.LibraryNostra.livraria.produtos.Book;

public class CompareByName implements Comparator<Book>{

	@Override
	public int compare(Book l1, Book l2) {
		return l1.getName().compareTo(l2.getName());
	}
}
