package br.com.LibraryNostra.livraria.testes;

import java.util.HashSet;


public class ConsultDiscounts {

	public static void main(String[] args) {
		
		CouponsManager manager = new CouponsManager();
		
		Double discount = manager.validateCoupons("CUP74");
		
		if(discount != null){
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor "+ discount);
		} else {
			System.out.println("Esse cupom não existe.");
		}
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		System.out.println(set.size());
	}
}
