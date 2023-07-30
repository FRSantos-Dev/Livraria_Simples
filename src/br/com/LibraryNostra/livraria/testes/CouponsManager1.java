package br.com.LibraryNostra.livraria.testes;

import java.util.Arrays;
import java.util.List;

public class CouponsManager1 {

	private List<String> coupons;
	
	public CouponsManager1() {
		this.coupons = Arrays.asList("CUP74", "CUP158", 
			"CUP14", "CUP52", "CUP21", "CUP221", "CUP91", 
			"CUP327", "CUP410", "CUP275", "CUP484", "CUP207", 
			"CUP96", "CUP119", "CUP174", "CUP291", "CUP1", 
			"CUP115", "CUP222", "CUP272");
	}

	public boolean validaCupom(String coupon) {
		return this.coupons.contains(coupon);
	}
	
	
}
