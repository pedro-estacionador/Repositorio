package heranca_encapsulamento;

import java.util.ArrayList;
import java.util.List;

abstract class Veiculo{
	String marca;
	String modelo;
	int ano;
	
	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		}
		public String getMarca() {
		return marca;
		}
		public void setMarca(String marca) {
		this.marca = marca;
		}
		public String getModelo() {
		return modelo;
		}
		public void setModelo(String modelo) {
		this.modelo = modelo;
		}
		public int getAno() {
		return ano;
		}
		public void setAno(int ano) {
		this.ano = ano;
		}
		public abstract void exibirInformacoes();
		}
	
class Carro extends Veiculo{
	public Carro(String marca, String modelo, int ano){
		super(marca, modelo, ano);
	}
	
	@Override
	public void exibirInformacoes(){
		System.out.println("Marca do Carro: " + marca);
		System.out.println("Modelo do Carro: " + modelo);
		System.out.println("Ano do Carro: " + ano);
	}
}

class Moto extends Veiculo{
	Moto(String marca, String modelo, int ano){
		super(marca, modelo, ano);
	}
	
	@Override
	public void exibirInformacoes(){
		System.out.println("Marca do Moto: " + marca);
		System.out.println("Modelo do Moto: " + modelo);
		System.out.println("Ano do Moto: " + ano);
	}
}

class Concessionaria{
	List<Veiculo> veiculos;
	
	Concessionaria() {
		this.veiculos=new ArrayList<>();
	}
	
	void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	void removerVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}
	
	void listarVeiculos() {
		for(Veiculo veiculo : veiculos) {
			veiculo.exibirInformacoes();
		}
	}
}

public class exerc4 {
	public static void main(String[] args) {
Concessionaria conces = new Concessionaria();
Veiculo carro = new Carro("Honda", "Civic", 2017); 
Veiculo moto = new Moto("Harley", "1952 Maisto", 2024);

conces.adicionarVeiculo(carro);
conces.adicionarVeiculo(moto);

System.out.println("Lista de veículos na concessionária:");
conces.listarVeiculos();
	}
}
