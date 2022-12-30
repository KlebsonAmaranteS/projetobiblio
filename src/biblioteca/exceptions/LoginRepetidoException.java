package biblioteca.exceptions;
/**
 * Verifica se o login digitado é valido
 * herda da classe RuntimeException 
 */

public class LoginRepetidoException  extends RuntimeException {
    public LoginRepetidoException(String valor) {
        super("O Login Digitado: " + valor + " � invalido.");
    }
}