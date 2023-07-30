package br.com.LibraryNostra.livraria;

public class Author {

	private String name;
	private String email;
	private String cpf;
	
	public void showDetails() {
		System.out.println("Showing Author Details");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Author)) return false;
		Author other = (Author) obj;
		return this.name.equals(other.name);
	}
	
}
