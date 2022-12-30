
package biblioteca.usuario;
/**
 * Instancia os metodos para apostila, livros, texto, opcao
 */
import biblioteca.acervo.*;

public interface InterfaceUsuario {
    void apostilaAlugada(Apostila apostila);
    void textoAlugado(Texto texto);
    void livroAlugado(Livro livro);
    boolean temAtraso(int opcao);
}