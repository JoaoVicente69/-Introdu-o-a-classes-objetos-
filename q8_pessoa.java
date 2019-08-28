package Introdução_a_classes_objetos;

public class q8_pessoa {
	String nome;
	int idade;
	double  altura;
	double  peso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double crescer() {
		
		if(idade <= 21) {
			this.altura += 0.05;
		}
		return this.altura;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("q8_pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", crescer()=");
		builder.append(crescer());
		builder.append("]");
		return builder.toString();
	}
	

	

}
