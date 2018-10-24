package ru.job4j.calculate;

/**
 * Calculate
 *@author Evgenii Shegai(34shegai@gmail.com)
 */

public class Calculate {

	private double result;

	public void add(double first, double second) {
		this.result = first + second;
	}

	public void subtract(double first, double second) {
		this.result = first - second;
	}

	public void div(double first, double second) {
		this.result = first/second;
	}

	public void multiple(double first, double second){
		this.result = first * second;
	}

	public double getResult(){
		return this.result;
	}


}