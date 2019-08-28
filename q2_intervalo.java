package Introdução_a_classes_objetos;

public class q2_intervalo {
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
	public int[] setfazendo() {
		int aux=num2-1;
		
		int[] array=new int[aux];
		for(int i =(num1+1);i<num2;i++) {
			array[i]=i;
		}
		return 	array;
	}
}
