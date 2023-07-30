package br.com.LibraryNostra.livraria;

import java.util.ArrayList;
import java.util.List;

import br.com.LibraryNostra.livraria.produtos.Product;

public class Cart {
	
	private double total;
	private List<Product> products;

	public Cart() {
		this.products = new ArrayList<Product>();
	}

	public void add(Product products) {
		this.products.add(products);
	}
	
	public void remove(int position) {
		this.products.remove(position);
	}
		
	public double getTotal() {
		return total;
	}
	
	public List<Product> getProducts() {
		return products;
	}
}
