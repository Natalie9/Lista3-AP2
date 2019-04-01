package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.ex03;

import java.util.Scanner;

public class Pessoa {

	String nome;
	int cpf;
	Emprestimo emprestimos;

	public Pessoa() {
		super();
	}

	public static Pessoa cadastrarPessoa() {
		Scanner ler = new Scanner(System.in);
		Pessoa pes = new Pessoa();
		System.out.println("Nome da pessoa: ");
		pes.setNome(ler.nextLine());
		System.out.println("CPF da pessoa: ");
		pes.setCpf(ler.nextInt());
		System.out.println("\tCadastro de nova pessoa realizado com sucesso!");
		return pes;
	}

	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Emprestimo getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(Emprestimo emprestimos) {
		this.emprestimos = emprestimos;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
