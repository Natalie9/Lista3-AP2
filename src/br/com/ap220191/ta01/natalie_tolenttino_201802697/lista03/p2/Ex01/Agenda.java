package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.Ex01;
/*
Exercício: 01
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	private static List<Contato> listaContatos = new ArrayList<Contato>();

	public void adicionaContato(Contato contato) {
		listaContatos.add(contato);
	}

	public Contato buscaContato(String nomeContato) {
		Contato novoContato = new Contato();
		for (Contato contato : listaContatos) {
			if (contato.getNome().equals(nomeContato)) {
				novoContato = contato;
			}
		}
		return novoContato;
	}
	public static void listarTodos() { 
			for(Contato contato: listaContatos) {
				System.out.println(contato.getNome());
		}
	}
	public void excluiContato(String nomeContato) {
		Iterator<Contato> iterator = listaContatos.iterator();
		while (iterator.hasNext()) {
			Contato contatoRemover = iterator.next();
			if (contatoRemover.getNome().equals(nomeContato)) {
				iterator.remove();
			}
		}

	}

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int op = 0;
		Agenda app = new Agenda();
		while (op != 4) {

			System.out.println(
					"O que deseja fazer? \n 1 - Adicionar novo contato \n 2 - Buscar contato  \n 3 - Excluir contato existente \n 4 - Sair");
			op = ler.nextInt();
			switch (op) {
			case 1:
				Contato novoContato = new Contato();
				System.out.println("Digite o nome do contato");
				novoContato.setNome(ler.next());
				System.out.println("Digite o email");
				novoContato.setEmail(ler.next());

				app.adicionaContato(novoContato);
				System.out.println("\n\t contato adicionado com sucesso!");
				break;

			case 2:
				System.out.println("Digite o nome de busca");
				Contato contatoConsultado = app.buscaContato(ler.next());
				if (contatoConsultado.getNome() != null) {
					System.out.println("\n Nome "+ contatoConsultado.getNome() + "\n email: " + contatoConsultado.getEmail());
				} else {
					System.out.println("Contato não encontrado!");

				}
				break;
			case 3:
				System.out.println("Digite o nome para excluir");
				app.excluiContato(ler.next());
				System.out.println("\n\t contato ecluido com sucesso! \n");
				break;
			
			}
			listarTodos();
		}

	}

}