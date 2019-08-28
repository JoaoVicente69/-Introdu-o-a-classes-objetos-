package Introdução_a_classes_objetos;

public class q4_salario {
 double ganha_hora;
 double horas_trabalhada;
 
 
 		public double getGanha_hora() {
			return ganha_hora;
		}
		public void setGanha_hora(double ganha_hora) {
			this.ganha_hora = ganha_hora;
		}
		public double getHoras_trabalhada() {
			return horas_trabalhada;
		}
		public void setHoras_trabalhada(double horas_trabalhada) {
			this.horas_trabalhada = horas_trabalhada;
		}
		public double setsalarioBruto() {
		return (30*ganha_hora)*horas_trabalhada;
		}
		public double setinss() {
			return(setsalarioBruto()-(setsalarioBruto()*0.08));	
		}
		public double setsindicato() {
			return(setsalarioBruto()-(setsalarioBruto()*0.05));
		}
		public double setsalariLiquido() {
			return setsalarioBruto()-(setsindicato()+setinss()+(/*ir*/(setsalarioBruto()-(setsalarioBruto()*0.05))));
			
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("q4_salario [getGanha_hora()=");
			builder.append(getGanha_hora());
			builder.append(", getHoras_trabalhada()=");
			builder.append(getHoras_trabalhada());
			builder.append(", setsalarioBruto()=");
			builder.append(setsalarioBruto());
			builder.append(", setinss()=");
			builder.append(setinss());
			builder.append(", setsindicato()=");
			builder.append(setsindicato());
			builder.append(", setsalariLiquido()=");
			builder.append(setsalariLiquido());
			builder.append("]");
			return builder.toString();
		}
}
