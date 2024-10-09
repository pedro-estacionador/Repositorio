package sistemaBiblioteca;

import java.util.List;
import java.util.ArrayList;

class Livro{
	int anoPublicacao;
	String titulo;
	String autor;
	
	Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		}
		public String getTitulo() {
		return titulo;
		}
		public void setTitulo(String titulo) {
		this.titulo = titulo;
		}
		public String getAutor() {
		return autor;
		}
		public void setAutor(String autor) {
		this.autor = autor;
		}
		public int getAnopublic() {
		return anoPublicacao;
		}
		public void setAnopublic(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
		}
		
		@Override
		public String toString() {
		return "Livro{" +
		"titulo='" + titulo + '\'' +
		", autor='" + autor + '\'' +
		", anoPublicacao=" + anoPublicacao +
		'}';	
}
}
class Biblioteca{
	List<Livro> livros;
	
	Biblioteca(){
		this.livros=new ArrayList<>();
	}
	
	void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	void removerLivro(String titulo) {
		livros.removeIf(livro -> livro.getTitulo().equals(titulo));
	}
	
	void listarLivros() {
		for(Livro livro : livros) {
			System.out.println(livro);
		}
	}
	
	public List<Livro> buscarPorAutor(String autor){
	List<Livro> livrosAutor=new ArrayList<>();
	
	for(Livro livro : livros) {
		if(livro.getAutor().equalsIgnoreCase(autor)) {
			livrosAutor.add(livro);
		}
	}
	return livrosAutor;
	}
	
}


public class exerc5 {
	public static void main(String[] args) {
		Biblioteca ohara = new Biblioteca();
		ohara.adicionarLivro(new Livro("One Piece", "Oda", 1999));
		ohara.adicionarLivro(new Livro("Extraordinario", "RJ palacio", 2012));
		ohara.adicionarLivro(new Livro("Sousou no frieren", "YK", 2022));
		ohara.adicionarLivro(new Livro("white bird", "RJ palacio", 2019));
		
		ohara.listarLivros();
		
	}
}

