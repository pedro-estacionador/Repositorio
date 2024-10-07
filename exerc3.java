package collectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Aluno {
private String nome;
private double nota;
public Aluno(String nome, double nota) {
this.nome = nome;
this.nota = nota;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public double getNota() {
return nota;
}
public void setNota(double nota) {
this.nota = nota;
}
@Override
public String toString() {
return "Aluno{" + "nome='" + nome + '\'' + ", nota=" + nota + '}';
}
}

public class exerc3{
public static void main(String[] args) {
List<Aluno> listaAlunos = new ArrayList<>();
Scanner scan = new Scanner(System.in);
int op;

do {
System.out.printf("0 - Sair\n1 - Adicionar Aluno\n2 - Remover aluno\n3 - Listar alunos\n4 - Média das notas\nEscolha uma das opções acima: ");
op=scan.nextInt();
switch(op) {
case 0:
	break;
	
case 1:
	listaAlunos.add(new Aluno("Maria", 8.5));
	listaAlunos.add(new Aluno("Maria", 8.5));
	listaAlunos.add(new Aluno("Carlos", 7.0));
	listaAlunos.add(new Aluno("Ana", 9.5));
	break;
	
case 2:
	listaAlunos.removeIf(aluno -> aluno.getNome().equals("Carlos"));
	System.out.println("Carlos removido.");
	break;
	
case 3:
	for (Aluno aluno : listaAlunos) {
		System.out.println(aluno);
		}
	break;
	
case 4:
	double soma = 0;
	for (Aluno aluno : listaAlunos) {
	soma += aluno.getNota();
	}
	double media = soma / listaAlunos.size();
	System.out.println("Média das notas: " + media);
	break;
	
	default:
		System.out.println("Opção inválida!");
		}
	}while(op!=0);
}
}

