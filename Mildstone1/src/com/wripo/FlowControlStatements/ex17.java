package com.wripo.FlowControlStatements;

public class ex17 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int r,q=0;
		int x=n;
		while(n>0)
		{
			r=n%10;
			q=q*10+r;
			n/=10;
		}
		if(x==q)
		{
	   System.out.println("Palindrome");
		}
		else
		{
	   System.out.println("Not a Palindrome");
		}
		
}
}
