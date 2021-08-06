package crudlistatelefonica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgendaTeste {

	@Test 
	void testCadastrarContato() {
		
		String retorno_teste = "";
		
		Agenda ag = new Agenda();
		
		retorno_teste = ag.cadastrarContato(0, "Agenor", "Lacerda", "22222222");
		assertTrue(retorno_teste == "POSIÇÃO INVÁLIDA!");
		
		
		retorno_teste = ag.cadastrarContato(1, "Agenor", "Lacerda", "22222222");
		assertTrue(retorno_teste == "CADASTRO REALIZADO!");
		
		
		
		
	}
	
	@Test 
	void testListarContato() {
		
		String retorno_teste = "";
		
		Agenda ag = new Agenda();
		
		retorno_teste = ag.cadastrarContato(1, "Agenor", "Lacerda", "22222222");
	
		retorno_teste = ag.listarContatos();
		
		System.out.println(retorno_teste.length());
		
		assertTrue(retorno_teste.compareTo("1-Agenor-Lacerda") == 0);
			
	}
	
	@Test 
	void testEditarContato() {
		
		String retorno_teste = "";
		
		Agenda ag = new Agenda();
		
		retorno_teste = ag.cadastrarContato(1, "Agenor", "Lacerda", "22222222");
		
		retorno_teste = ag.editarContato(1,"11111111");
		
		System.out.println(retorno_teste);
		assertTrue(retorno_teste.compareTo("Agenor Lacerda 11111111") == 0);
		
		
		
			
	}
	
	
	@Test
	void testApagarContato() {
		
		String retorno_teste = "";
		
		Agenda ag = new Agenda();
		
		retorno_teste = ag.cadastrarContato(1, "Agenor", "Lacerda", "22222222");
		
		retorno_teste = ag.apagarContato(1);
		assertTrue(retorno_teste == "CONTATO APAGADO");
		
		
	}
	
	

}
