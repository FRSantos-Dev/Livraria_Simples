package br.com.LibraryNostra.livraria.produtos;

public interface Promotional {

	boolean applyDiscount(double percent);
	
	default boolean apply10PercentDiscount(double d) {
		return apply10PercentDiscount(0.1);
	}
}