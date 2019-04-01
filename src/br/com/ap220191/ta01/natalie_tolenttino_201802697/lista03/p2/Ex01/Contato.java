
package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.Ex01;
/*
Exercício: 01
*/

public class Contato {
	private String nome;
	private String email;
	
	public Contato() {}
	
	public Contato(String n, String e) {
		this.nome = n;
		this.email = e;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}