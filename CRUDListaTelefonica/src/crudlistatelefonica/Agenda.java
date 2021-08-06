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
public class Agenda {

	private final Contato[] contatos;

	public Agenda() {

		contatos = new Contato[100];

	}

	public String cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {

		//teste funcionando
		
		if (posicao > 100 || posicao < 1) {
			return "POSIÇÃO INVÁLIDA!";
		} else {
			contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
			return "CADASTRO REALIZADO!";
		}
		// teste erro
//		contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
//		return "CADASTRO REALIZADO!";
	}

	public String editarContato(int posicao, String telefone) {
		if (posicao < 1 || posicao > 100) {
			return "POSIÇÃO INVÁLIDA";
		} else if (contatos[posicao - 1] != null) {
			contatos[posicao - 1].setTelefone(telefone);
//			teste dando falha
//		contatos[posicao - 1].setNome(telefone);
			return contatos[posicao - 1].toString();
		} else {
			return "POSIÇÃO OCUPADA!"; 

		}
	}
	
	
	public String apagarContato(int posicao) {
		if (posicao < 1 || posicao > 100) {
			return "POSIÇÃO INVÁLIDA";
		} else if (contatos[posicao - 1] != null) {
			contatos[posicao - 1] = null;
			return "CONTATO APAGADO";
		} else {
			return "POSIÇÃO VAZIA!"; 

		}
	}

	public String listarContatos() {
		String saida = "";

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				saida += (i+1) + "-" + contatos[i].getNome() + "-" + contatos[i].getSobrenome();
			} 
		}
		if (saida.isEmpty()) {
			saida = "Agenda vazia";
		}
		return saida;
	}

	public boolean equals(Agenda agenda) {
		Contato[] meusctt = this.contatos;
		Contato[] outroctt = agenda.contatos;
		if (meusctt.length != outroctt.length) {
			return false;
		} else {
			for (int i = 0; i < meusctt.length; i++) {
				Contato c1 = meusctt[i];
				Contato c2 = outroctt[i];
				if (!(c1.equals(c2))) {
					return false;
				}
			}
		}
		return true;
	}
}