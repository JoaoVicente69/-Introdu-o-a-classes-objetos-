package Introdução_a_classes_objetos;

public class q9_banco {
	 int conta;
	 String nome;
	 double saldo;
	
	
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		if(conta > 0) {
			this.conta = conta;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 2) {
		this.nome = nome;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public String alterarNome(String nome) {
		return this.nome = nome;
	}
	
	
	public double deposito(double valorDeposito) {
		return this.saldo += valorDeposito;
	}
	
	
	public double saque(float valorSaque) {
		return this.saldo -= valorSaque;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [getConta()=");
		builder.append(getConta());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append("]");
		return builder.toString();
	}

}
