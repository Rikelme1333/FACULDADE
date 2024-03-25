
public class biblioteca {
	public static void main(String[] args) {
		Livros L1 = new Livros("A Metamorfose", "Franz Kafka", 1915, 144);
		Livros L2 = new Livros("Rapido e Devagar", "Daniel Kahneman", 2011, 746);
		Livros L3 = new Livros("O Corvo", "Edgar Allan Poe", 1845, 200);
		
		System.out.println("Titulo do Livro: " + L1.titulo + "\nAutor do Livro: " + L1.autor + "\nAno de Publicacão: " + L1.anodepub + "\nNúmero de paguinas: " + L1.qntPag);
		System.out.println();
		System.out.println("Titulo do Livro: " + L2.titulo + "\nAutor do Livro: " + L2.autor + "\nAno de Publicacão: " + L2.anodepub + "\nNúmero de paguinas: " + L2.qntPag);
		System.out.println();
		System.out.println("Titulo do Livro: " + L3.titulo + "\nAutor do Livro: " + L3.autor + "\nAno de Publicacão: " + L3.anodepub + "\nNúmero de paguinas: " + L3.qntPag);
		System.out.println();
		
		L1.dadosPoo();
		
 }
}
	


