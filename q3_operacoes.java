package Introdução_a_classes_objetos;

public class q3_operacoes {
	int num1;
	int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int setsoma() {
		return num1+num2;	
	}
	public int setdivisao() {
		return num1/num2;	
	}
	public int setmultiplicacao() {
		return num1*num2;	
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("q4_operacoes [num1=");
		builder.append(num1);
		builder.append(", num2=");
		builder.append(num2);
		builder.append(", setsoma()=");
		builder.append(setsoma());
		builder.append(", setdivisao()=");
		builder.append(setdivisao());
		builder.append(", setmultiplicacao()=");
		builder.append(setmultiplicacao());
		builder.append(", setmenos()=");
		builder.append(setmenos());
		builder.append("]");
		return builder.toString();
	}
	public int setmenos() {
		return num1-num2;	
	}
}
