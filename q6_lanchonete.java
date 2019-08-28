package Introdução_a_classes_objetos;

public class q6_lanchonete {
	int codigo;
	int quantidade;
	public int getPedido() {
		return codigo;
	}
	public void setcodigo(int codigo) {
		if (codigo >=  100  && codigo <= 106 )
			this . codigo = codigo;
		}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("q6_lanchonete [setpedido()=");
		builder.append(setpedido());
		builder.append("]");
		return builder.toString();
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double setpedido() {
	double valor =  0 ;
		
		switch ( this . codigo) {
		
		case  100 :
				valor =  1.20 ;
				break ;
		case  101 :
				valor =  1.30 ;
				break ;
		case 102: valor =  1.50 ;
			break ;
		case  103 :
				valor =  1.20 ;
				break ;
			case  104 :
				valor =  1.30 ;
				break ;
		case  105 :
				valor =  1.00 ;
				break ;
		}
		
		  return  (quantidade * valor);
		
	
	}
	
}
