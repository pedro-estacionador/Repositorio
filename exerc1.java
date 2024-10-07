package encapsulamento;

class Produto{
	String nome;
	double preco;
	int quantidadeEstoque;


	Produto(){
	
	}
	
	void setNome(String nome) {
		this.nome=nome;
	}
	
	String getNome() {
		return nome;
	}
	
	
	void setPreco(double preco) {
		this.preco=preco;
	}
	
	double getPreco() {
		return preco;
	}
	
	
	void setQtdEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque=quantidadeEstoque;
	}
	
	int getQtdEstoque() {
		return quantidadeEstoque;
	}
	
	void aplicarDesconto(double percentual) {
		this.preco=preco*(1-percentual/100);
	}
}




public class exerc1 {

	public static void main(String[] args) {
		Produto prod = new Produto();
	
	prod.setNome("Marijuana");
	prod.getNome();
	
	prod.setPreco(500);
	prod.getPreco();
	
	prod.setQtdEstoque(17);
	prod.getQtdEstoque();
	
	prod.aplicarDesconto(20);
	
	System.out.println("Produto com desconto: " + prod.preco);
	}

}