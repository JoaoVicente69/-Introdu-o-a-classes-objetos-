package Introdução_a_classes_objetos;

public class q9_bancoMain {

	public static void main(String[] args) {
		q9_banco opBanco=new q9_banco();
		opBanco.setConta(1);
		opBanco.setNome("joao");
		opBanco.setSaldo(300);
		System.out.println(opBanco);
		
		opBanco.saque(10);
		opBanco.alterarNome("santos");
		opBanco.deposito(100);
		System.out.println(opBanco);

	}

}
