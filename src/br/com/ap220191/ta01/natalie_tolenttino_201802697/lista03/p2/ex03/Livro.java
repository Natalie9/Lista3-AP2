package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.Ex01.Contato;

public class Livro {

	String nome;
	String autor;
	int id;

	private static List<Livro> listaLivros = new ArrayList<Livro>();

	public static void cadastrarLivro() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do livro: ");
		String nome =ler.nextLine();
		System.out.println("Digite o nome do autor: ");
		String autor = ler.nextLine();
		System.out.println("Digite o identificador: ");
		int id = ler.nextInt();
		Livro novoLivro = new Livro(nome, autor, id);
		listaLivros.add(novoLivro);
		System.out.println("\t Cadastro de novo livro realizado!");
	}

	public static void listarTodos() {
		for (Livro livro : listaLivros) {
			System.out.println("Livros disponíveis: \n" + livro.getId()+ "*" + livro.getNome() + " - " + livro.getAutor());
		}
	}
	public static void retirarLivro(int id) {
		Iterator<Livro> iterator = listaLivros.iterator();
		while (iterator.hasNext()) {
			Livro livroRemover = iterator.next();
			if (livroRemover.getId()==(id)) {
				iterator.remove();
			}
		}
	}
	public static Livro buscaLivro(int id) {
		Livro novoLivro = new Livro();
		for (Livro livro : listaLivros) {
			if (livro.getId()==(id)) {
				novoLivro = livro;
			}
		}
		return novoLivro;
	}

	public Livro() {
		super();
	}

	public Livro(String nome, String autor, int id) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
