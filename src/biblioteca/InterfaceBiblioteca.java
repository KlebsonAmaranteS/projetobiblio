
package biblioteca;

public interface InterfaceBiblioteca {
    boolean logarUsuario(String usuario, String senha);
    void cadastrarUsuario(String nomeUser,String endUser, String cpfUser, String loginUser, String senhaUser);
    void cadastrarLivro(String newTitulo, String newAutor, String newIsbm, int newEdicao);
    void cadastrarApostila(String newTitulo, String newAutor);
    void cadastrarTexto(String newTitulo, String newAutor);
    void removerLivro(String tituloremov);
	void removerApostila(String tituloremov);
	void removerTexto(String tituloremov);
	void listarLivros();
	void listarTextos();
	void listarApostilas();
        void listarUsuarios();
	int pesquisarAcervo(int item, String elemento);
	int devolver(int opcao);
	boolean alugarLivro(String itemproc);
	boolean alugarApostila(String itemproc);
	boolean alugarTexto(String itemproc);
        boolean podeAlugar(String usuario);
        boolean setAdmin(String usuario, boolean status);
        boolean isAdminLogado();
       
} 