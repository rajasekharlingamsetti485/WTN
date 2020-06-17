package com.wripo.Arrays;

public class ex9 {
	public static void main(String[] args) {
		int i,c=0;
		for(i=0;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			if(x==10)
				c++;
			else
				System.out.print(x+" ");
		}
		for(i=0;i<c;i++)
		{
			System.out.print("0 ");
		}
	}
}
