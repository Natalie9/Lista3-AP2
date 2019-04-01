package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.Ex02;

import java.util.Scanner;

/*
Exercício: 02
*/
public class Supermecado {
	static Scanner ler = new Scanner(System.in);

	public static void novoProduto() {
		System.out.println("Digite o nome do novo produto");
		String nome = ler.next();
		System.out.println("Digite o preço");
		Double preco = ler.nextDouble();
		System.out.println("Quantidade em estoque");
		int qtd = ler.nextInt();
		Produto.cadastrarProduto(nome, qtd, preco);
	}

	public static void main(String args[]) {
		int op = 0;

		while (op != 3) {
			System.out.println(" 1 - cadastrar novo produto \n 2 - Cliente realizar pedido \n 3 - sair");
			op = ler.nextInt();
			switch (op) {
			case 1:
				novoProduto();
				break;
			case 2:
				Cliente cliente1 = new Cliente();
				cliente1.realizarPedido();
				break;

			}
		}

	}

}
