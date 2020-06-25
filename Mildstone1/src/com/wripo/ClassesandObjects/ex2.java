package com.wripo.ClassesandObjects;

public class ex2 {
	
	public static void main(String[] args) {
		System.out.println(Calc.powerInt(12, 2));
		System.out.println(Calc.powerDouble(1.5, 2));
	}

}
class Calc {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

