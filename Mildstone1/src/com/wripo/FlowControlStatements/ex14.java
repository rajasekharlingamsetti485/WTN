package com.wripo.FlowControlStatements;

public class ex14 {

	public static void main(String[] args) {
		int i,sum=0;
		int n=346;
		for(i=0;n!=0;n=n/10)
		{
			sum=sum+(n%10);
		}
		System.out.println(sum);

	}

}
