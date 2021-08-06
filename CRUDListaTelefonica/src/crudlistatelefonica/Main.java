/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudlistatelefonica;

/**
 *
 * @author dimik
 */
import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("1 - Cadastrar Contato");
		System.out.println("2 - Listar Contatos");
		System.out.println("3 - Deletar Contato");
		System.out.println("4 - Edita Telefone");
		System.out.println("5 - Sair");
		System.out.println("Opção");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Agenda agenda = new Agenda();

		menu();
		String operacao = input.nextLine();

		do {
			switch (operacao) {
			
			case "1":

				System.out.println("Posição: ");
				int posicao = input.nextInt();
				System.out.println("Nome: ");
				String nome = input.next();
				System.out.println("Sobrenome: ");
				String sobrenome = input.next();
				System.out.println("Telefone: ");
				String telefone = input.next();

				String mensagem = agenda.cadastrarContato(posicao, nome, sobrenome, telefone);
				System.out.println(mensagem);

				break;

			case "2":
				
				System.out.println(agenda.listarContatos());
				
				break;
			
			case "3":
				
				System.out.println("Digite o número correspondente ao contato que deseja apagar");
				int pos= input.nextInt();
				String cont = agenda.apagarContato(pos);
				System.out.println(cont);
				
				break;
				
			case "4":
				
				System.out.println("Digite o número correspondente ao contato que deseja editar o telefone");
				int ps= input.nextInt();
				System.out.println("Digite o novo numero do telefone");
				String telefone1 = input.next();
				
				String conta = agenda.editarContato(ps,telefone1);
				System.out.println(conta);
				
				break;
				
				
			default:
				break;
			}

			menu();
			operacao = input.nextLine();

		} while (!(operacao.equals("5")));
	}
}
