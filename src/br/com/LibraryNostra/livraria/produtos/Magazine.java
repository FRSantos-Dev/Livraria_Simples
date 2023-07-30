package br.com.LibraryNostra.livraria.produtos;

import br.com.LibraryNostra.livraria.PublishingCompany;

public class Magazine implements Product, Promotional {

	private String name;
	private String description;
	private double value;
	private PublishingCompany publishingCompany;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public PublishingCompany getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(PublishingCompany publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public boolean applyDiscount(double percent) {
		if (percent > 0.1) {
			return false;
		}
		double discount = getValue() * percent;
		setValue(getValue() - discount); 
		return true;
	}

	@Override
	public int compareTo(Product other) {
		
		if (this.getValue() < other.getValue()){
			return -1;
		}
		if (this.getValue() > other.getValue()){
			return 1;
		}
		return 0;
	}
}