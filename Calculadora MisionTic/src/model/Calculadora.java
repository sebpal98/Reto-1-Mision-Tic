package model;

public class Calculadora {

	private double numOne;
	private double numeTwo;
	
	public Calculadora(double numOne, double numeTwo) {
		this.numOne = numOne;
		this.numeTwo = numeTwo;
	}

	public Calculadora(double numOne) {
		this.numOne = numOne;
	}
	
	public double sum() {
		return this.numOne + this.numeTwo;
	}
	
	public double sustrain() {
		return this.numOne - this.numeTwo;
	}
	
	public double multiply() {
		return this.numOne * this.numeTwo;
	}
	
	public double divide() {
		return this.numOne / this.numeTwo;
	}
	
	public double pow() {
		return Math.pow(this.numeTwo, this.numOne);
	}
	
	public double squareRoot() {
		return Math.sqrt(this.numOne);
	}
}
