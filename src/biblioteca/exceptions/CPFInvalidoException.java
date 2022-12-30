
package biblioteca.exceptions;

/**
 * Verifica se os numeros digitados na area de CPF são validos
 * A classe herda de RuntimeException
 */

public class CPFInvalidoException extends RuntimeException {

  public CPFInvalidoException(String valor) {
    super("O CPF Digitado: " + valor + " � invalido.");
  }
}