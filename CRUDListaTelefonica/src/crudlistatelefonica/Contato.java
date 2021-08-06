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
public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean equals(Contato c2) {

            return !(nome.equals(c2.getNome()) && sobrenome.equals((c2.getSobrenome())));
	}

        @Override
	public String toString() {
		return nome + " " + sobrenome + " " + telefone;
	}

}
