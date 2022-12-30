package biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteca.acervo.Apostila;
import biblioteca.acervo.Texto;

class BibliotecaTest {


	@Test
	void testCadastrarApostila() {
		
		ArrayList<Apostila> apostilas = new ArrayList<Apostila>();
		
		Apostila apostila1 = new Apostila();
		apostila1.setTitulo("Apostila de exemplo");
		apostila1.setAutor("Autor de Teste");
		apostilas.add(apostila1);
		
		Apostila resultEsperado = apostilas.get(0);
		
		
		
		Apostila apostila = new Apostila();
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.cadastrarApostila("Apostila de exemplo", "Autor de Teste");
		
		Apostila resultado = apostilas.get(0);

		assertEquals(resultEsperado,resultado);
		
	}

	@Test
	void testCadastrarTexto() {
		
		ArrayList<Texto> textos = new ArrayList<Texto>();
		
		Texto texto1 = new Texto();
		texto1.setTitulo("texto de exemplo");
		texto1.setAutor("Autor de Teste");
		textos.add(texto1);
		
		Texto resultEsperado = textos.get(0);
		
		
		
		Texto texto = new Texto();
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.cadastrarTexto("texto de exemplo", "Autor de Teste");
		
		Texto resultado = textos.get(0);

		assertEquals(resultEsperado,resultado);
		
	}

}
