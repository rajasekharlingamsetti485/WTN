package com.wripo.Arrays;

public class ex10 {
	public static void main(String[] args) {
		int i;
		int a[]=new int [args.length];
		for(i=0;i<args.length;i++)
		{
			int x= Integer.parseInt(args[i]);
			a[i]=x;
		}
		for(i=0;i<args.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
				a[i]=0;
			}
		}
		for(i=0;i<args.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

