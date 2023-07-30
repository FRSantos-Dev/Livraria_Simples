package br.com.LibraryNostra.livraria.produtos;

import br.com.LibraryNostra.livraria.Author;

public class phsysicalBook extends Book implements Promotional {

	public phsysicalBook(Author author) {
		super(author);
	}

	public double getPrintFee() {
		return this.getValue() * 0.05;
	}
	
	public boolean applyDiscount(double percent) {
		if (percent > 0.3) {
			return false;
		}
		double discount = getValue() * percent;
		setValue(getValue() - discount); 
		return true;
	}
}
