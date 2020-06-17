package com.wipro.Arrays;

public class ex1 {
	public static void main(String[] args) {
		int c=0,x;
		for(int i=0;i<args.length;i++)
		{
			int v=Integer.parseInt(args[i]);
			 c+=v;
		}
		x=c/args.length;
		System.out.println(x+","+c);
	}
}
