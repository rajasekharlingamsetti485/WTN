package com.wripo.ClassesandObjects;

public class ex2 {
	public class calci{
		public static void main(String[] args) {
			System.out.println(calculator.powerInt(10,2));
			System.err.println(calculator.powerDouble(10.0,2));
		}
	}

	class calculator{
		static double powerDouble(double num1,double num2)
		{
		  return Math.pow(num1, num2);	
		}
		static int powerInt(int num1,int num2)
		{
		  return (int)Math.pow(num1, num2);	
		}
	}
}
