
package br.com.LibraryNostra.livraria.produtos;

import br.com.LibraryNostra.livraria.Author;

public class Ebook extends Book implements Promotional {

	private String waterMark;
	
	public Ebook(Author author) {
		super(author);
	}
	
	@Override
	public boolean applyDiscount(double percent) {
		if (percent > 0.15) {
			return false;
		}
		double discount = getValue() * percent;
		setValue(getValue() - discount);
		return true;
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	@Override
	public String toString() {
		return "I'm Ebook";
	}
}
