
package biblioteca.exceptions;
/**
 * Verifica se o ISBN digitado pelo usuario é valido
 * Herda da classe RuntimeException 
 */
public class ISBNInvalidoException extends RuntimeException {

  public ISBNInvalidoException(String valor) {
    super("O ISBN Digitado: " + valor + " � invalido.");
  }
}