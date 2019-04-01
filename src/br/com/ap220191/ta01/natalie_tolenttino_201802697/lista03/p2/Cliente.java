package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	static 	Scanner ler = new Scanner(System.in);

	private int pedidos; 
	
	public int getPedidos() {
		return pedidos;
	}

	public void setPedidos(int pedidos) {
		this.pedidos = pedidos;
	}
	
	private static List<Item> listaPedidos = new ArrayList<Item>();
	
	public void realizarPedido() { 
		Item item = new Item();
		System.out.println("Lista de produtos: ");
		Produto.listarTodos();
		
		System.out.println("Nome do produto que deseja comprar");
		String nome = ler.next();
		item.setProduto(Produto.buscaProduto(nome));
		
		System.out.println("Quantidade desejada");
		int qtd = ler.nextInt();
		item.setQtdDesejada(qtd);
		
		System.out.println("Forma de pagamento: \n 1 - Dinheiro \n 2 - Dinheiro \n 3 - Cheque");
		item.setPagamento(ler.nextInt());
		
		listaPedidos.add(item);
		
		Produto.tirarEstoque(nome, qtd);		
		
		System.out.println("\t Pedido realizado!");
		
		
		
		
	}
}
