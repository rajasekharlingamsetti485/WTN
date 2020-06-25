package com.wripo.Inheritance;
class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
 class Employee extends Person {
		private double annualSalary;
		private int yearOfJoining;
		private String nationalInsuranceNo;
		
		public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
			super(name);
			this.annualSalary = annualSalary;
			this.yearOfJoining = yearOfJoining;
			this.nationalInsuranceNo = nationalInsuranceNo;
		}

		public double getAnnualSalary() {
			return annualSalary;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public String getNationalInsuranceNo() {
			return nationalInsuranceNo;
		}
		
		@Override
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", nationalInsuranceNo="
					+ nationalInsuranceNo + ", name=" + name + "]";
		}
	}
public class ex2 {
	public static void main(String[] args) {
		Employee employee = new Employee("Rajasekhar", 5000000, 2021, "949340srpq8912");
		System.out.println(employee);
	}
}
