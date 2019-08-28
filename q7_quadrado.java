package Introdução_a_classes_objetos;

public class q7_quadrado {
	double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	//calcular a área 
	public double calculaArea() {
		return lado * lado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("q7_quadrado [calculaArea()=");
		builder.append(calculaArea());
		builder.append("]");
		return builder.toString();
	}

}
