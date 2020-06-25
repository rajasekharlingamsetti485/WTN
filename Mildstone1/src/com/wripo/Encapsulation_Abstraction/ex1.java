package com.wripo.Encapsulation_Abstraction;
class Patient {
	String name;
	double height;
	double weight;
	public Patient(String n, double h, double w) {
		name = n;
		height = h;
		weight = w;
	}
	public double computeBMI () {
		return ( weight / ( height * height ) );
	}
}
public class ex1 {
	public static void main(String[] args) {
		Patient patient = new Patient("Rohith",1.77, 59);	
		System.out.println(patient.computeBMI());
	}
}
