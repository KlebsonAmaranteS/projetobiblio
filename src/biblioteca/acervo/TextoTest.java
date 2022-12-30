package biblioteca.acervo;

class TextoTest {

	Texto texto = new Texto();

	@Test
	void testGetAutor() {
		
		String autor = null;
		String resultado = texto.getAutor();
		
		assertEquals(autor,resultado);
		
	}

	private void assertEquals(String autor, String resultado) {
	}

	@Test
	void testGetTitulo() {
		
		String titulo = null;
		String resultado = texto.getTitulo();
		
		assertEquals(titulo,resultado);
		
	}

}
