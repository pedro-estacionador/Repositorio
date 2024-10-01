package DesafioArray;

class Pessoa{
	protected String nome;
	protected int idade;
	
	Pessoa(String nome, int idade){
		this.nome=nome;
		this.idade=idade;
	}

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
	public void exibirInfo(){
		System.out.println("A pessoa chama-se: " + nome);
		System.out.println("A pessoa tem a idade: " + idade);
	}	
}

class Aluno extends Pessoa{
	protected String matricula;
	
	Aluno(String nome, int idade, String matricula){
		super(nome, idade);
		this.matricula=matricula;
	}
	
	@Override
	public void exibirInfo() {
	System.out.println("Nome do aluno: " + nome);
	System.out.println("Idade do aluno: " + idade);
	System.out.println("Matrícula do aluno: " + matricula);	
	}
}

class Professor extends Pessoa{
	protected double salario;
	
	Professor(String nome, int idade, double salario){
		super(nome, idade);
		this.salario=salario;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Nome do professor: " + nome);
		System.out.println("Idade do professor: " + idade);
		System.out.println("O salário do professor é: " + salario);
	}
}

public class Atividade2 {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("ROgerin pirocão", 17, "UC171724");
		Professor prof = new Professor("Prof safadão", 34, 1700.17);
		
		aluno.exibirInfo();
		prof.exibirInfo();
	}
}
