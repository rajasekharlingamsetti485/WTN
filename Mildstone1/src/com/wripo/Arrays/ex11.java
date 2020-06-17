package com.wripo.Arrays;

public class ex11 {
	public static void main(String[] args) {
		int i,c=0;
		for(i=0;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			if(x!=1&&x!=4)
				c++;
		}
		if(c!=0)
			System.out.println("False");
		else
			System.out.println("True");
	}
}
