package heranca;

class Pessoa{
	String nome;
	int idade;

Pessoa(String nome, int idade){
	this.nome=nome;
	this.idade=idade;
}
 
void mostraPessoa() {
	System.out.printf("Nome: %s\nIdade: %d\n",nome,idade);
}

}

class Funcionario extends Pessoa{
	double salario;
	String cargo;
	
	Funcionario(String nome, int idade, double salario, String cargo){
	super(nome, idade);
	this.salario=salario;
	this.cargo=cargo;
	}
	
	double calcularSalarioAnual() {
	return salario*12;	
	}
	
	void exibirFuncionario() {
		mostraPessoa();
		System.out.println("Salário anual: " + calcularSalarioAnual());
	}
}


public class exerc2 {
	public static void main(String[] args) {
		Funcionario fun = new Funcionario("Neuralho", 17, 1500,"Garoto de programa");
	fun.calcularSalarioAnual();
	fun.exibirFuncionario();
	
	}

}
