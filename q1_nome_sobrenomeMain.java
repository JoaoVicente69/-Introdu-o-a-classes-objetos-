package Introdu��o_a_classes_objetos;

public class q1_nome_sobrenomeMain {

	public static void main(String[] args) {
		q1_nome_sobrenome q1= new q1_nome_sobrenome();
		
		
		q1.setNome("douglas");
		q1.setSobrenome("sabel");
		System.out.println(q1);
		System.out.printf("seu nome completo � "+q1.getNome()+" "+q1.getSobrenome());
	}

}
