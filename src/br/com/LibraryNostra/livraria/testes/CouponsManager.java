package br.com.LibraryNostra.livraria.testes;

import java.util.HashMap;
import java.util.Map;

public class CouponsManager {

	private Map<String, Double> coupons;
	
	public CouponsManager() {
		
		this.coupons = new HashMap<>();
		
		coupons.put("CUP74", 10.0);
		coupons.put("CUP158", 15.00);
		coupons.put("CUP14", 5.99);
		coupons.put("CUP52", 20.00);
		
		// ...
	}

	public Double validateCoupons(String coupon) {
		return this.coupons.get(coupon);
	}	
}
