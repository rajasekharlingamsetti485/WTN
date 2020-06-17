package com.wripo.Arrays;

public class ex13 {
	public static void main(String[] args) {
		int i,j;
		int k=args.length-1;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				int x=Integer.parseInt(args[k]);
				System.out.print(x+" ");
				k--;
			}
			System.out.println();
		}
	}
}
