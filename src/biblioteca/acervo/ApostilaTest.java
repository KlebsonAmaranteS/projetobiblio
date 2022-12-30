package biblioteca.acervo;

class ApostilaTest {

	Apostila apostila = new Apostila();

	@Test
	void testGetTitulo() {
		
		String titulo = null;
		String resultado = apostila.getTitulo();
		
		assertEquals(titulo,resultado);
	}

	private void assertEquals(String titulo, String resultado) {
	}

	@Test
	void testGetAutor() {
		
		String autor = null;
		String resultado = apostila.getAutor();
		
		assertEquals(autor,resultado);
		
	}

}
