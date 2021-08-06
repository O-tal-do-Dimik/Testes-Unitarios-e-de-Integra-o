package crudlistatelefonica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgendaTestIntegracao {

	@Test
	void testIntegracao() {
		
		String retorno_teste = ""; 
		Agenda ag = new Agenda();  
		
		ag.cadastrarContato(1, "Agenor", "Lacerda", "22222222");
		
		retorno_teste = ag.editarContato(1,"11111111");
		assertTrue(retorno_teste.compareTo("Agenor Lacerda 11111111") == 0);
		
		ag.apagarContato(1);       
		
        
		retorno_teste = ag.listarContatos();
		
		assertTrue(retorno_teste.compareTo("Agenda vazia") == 0);
		
	}



}
