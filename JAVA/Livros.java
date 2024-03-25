
public class Livros{
	String titulo;
	String autor;
	int anodepub;
	int qntPag;
	
	public Livros(String titulo, String autor, int anodepub, int qntPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anodepub = anodepub;
		this.qntPag = qntPag;
	}
	void dadosPoo() {
		System.out.println("Titulo do Livro:" + titulo);
		System.out.println("Autor do Livro: " + autor);
		System.out.println("Data de Publicação: " + anodepub);
		System.out.println("Quantidade de Paginas: " + qntPag);
	}
	
}

