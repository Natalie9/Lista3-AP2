package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Exercício: 02
*/
public class Produto {
	Double preco;
	int qtdEstoque;
	String nome;

	private static List<Produto> listaProdutos = new ArrayList<Produto>();

	public static void cadastrarProduto(String nome, int qtd, Double preco) {

		Produto novoProduto = new Produto(preco, qtd, nome);
		listaProdutos.add(novoProduto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	public static void tirarEstoque(String nomeProduto, int qtd) {

		Produto novoProduto = new Produto();
		for (Produto produto : listaProdutos) {
			if (produto.getNome().equals(nomeProduto)) {
				int index= listaProdutos.indexOf(produto);
				novoProduto.setNome(produto.getNome());
				novoProduto.setPreco(produto.getPreco());
				novoProduto.setQtdEstoque(produto.getQtdEstoque()-qtd);
				
				listaProdutos.set(index, novoProduto);
			}
		}
	}

	public static Produto buscaProduto(String nomeProduto) {

		Produto novoProduto = new Produto();
		for (Produto produto : listaProdutos) {
			if (produto.getNome().equals(nomeProduto)) {
				novoProduto = produto;
			}
		}
		return novoProduto;
	}

	public Produto() {
		super();
	}

	public static void listarTodos() {
		for (Produto produto : listaProdutos) {
			System.out.println(produto.getNome() + " quantidade: " + produto.getQtdEstoque());
		}
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto(Double preco, int qtdEstoque, String nome) {
		super();
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.nome = nome;
	}
}
