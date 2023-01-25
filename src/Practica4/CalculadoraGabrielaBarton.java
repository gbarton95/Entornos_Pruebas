package Practica4;

public class CalculadoraGabrielaBarton {

	private int num1, num2;

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

	/**
	 * @param num1
	 * @param num2
	 */
	public CalculadoraGabrielaBarton(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int suma() {
		int result = num1+num2;
		return result;
	}
	
}
