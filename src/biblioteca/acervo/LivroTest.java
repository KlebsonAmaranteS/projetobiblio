package biblioteca.acervo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LivroTest {


	Livro livro = new Livro();
	
	
	@Test
	void testGetTitulo() {
		
		String titulo = null;
		String resultado = livro.getTitulo();
		
		assertEquals(titulo,resultado);
	}

	
	@Test
	void testGetAutor() {
		String autor = null;
		String resultado = livro.getAutor();
		
		assertEquals(autor,resultado);
	}

	
	@Test
	void testGetISBN() {
		String ISBN = null;
		String resultado = livro.getISBN();
		
		assertEquals(ISBN,resultado);
	}

	
	@Test
	void testGetEdicao() {
		
		int edicao = 0;
		int resultado = livro.getEdicao();
		
		assertEquals(edicao,resultado);
	}

}
