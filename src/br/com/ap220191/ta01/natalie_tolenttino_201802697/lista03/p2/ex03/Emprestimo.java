package br.com.ap220191.ta01.natalie_tolenttino_201802697.lista03.p2.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Emprestimo {

	Pessoa pessoa;
	Livro livro;

	private static List<Emprestimo> listaEmprestimos = new ArrayList<Emprestimo>();

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int op = 0;
		while (op != 4) {
			System.out
					.println("1 - Cadastrar novo livro \n2 - Fazer emprestimo \n3 - Consultar emprestimos \n4 - Sair");
			op = ler.nextInt();
			switch (op) {
			case 1:
				Livro.cadastrarLivro();
				break;
			case 2:
				realizarEmprestimo();
				break;
			case 3:
				listarTodos();
				break;
			}
		}

		System.out.println("");

	}

	public static void listarTodos() {
		for (Emprestimo e : listaEmprestimos) {
			System.out.println(
					"\tEmprestimos disponíveis: \n" + "\t\t Pessoa: " + e.pessoa.getNome() + "\tLivro: " + e.livro.getNome());
		}
	}

	public static void realizarEmprestimo() {
		Scanner ler = new Scanner(System.in);
		Pessoa pes = new Pessoa();
		Emprestimo emp = new Emprestimo();
		Livro livroReq = new Livro();

		pes = Pessoa.cadastrarPessoa();

		Livro.listarTodos();

		System.out.println("\n Digite o id do livro desejado: ");
		emp.livro = Livro.buscaLivro(ler.nextInt());
		emp.pessoa = pes;

		listaEmprestimos.add(emp);
		Livro.retirarLivro(emp.livro.getId());
		System.out.println("Emprestimo realizado!");

	}

}
