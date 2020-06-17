package com.wripo.Arrays;

public class ex6 {
	public static void main(String[] args) {
		int i,t=0,j;
		int[] a=new int[args.length];
		for( i=0;i<args.length;i++)
		   a[i]=Integer.parseInt(args[i]);
		for(i=0;i<args.length;i++)
		{
		for(j=i+1;j<args.length;j++)
		{
		if(a[i]>a[j])
		{
		t=a[i];
		a[i]=a[j];
		a[j]=t;
		}
		}
		}
		for( i=0;i<args.length+1;i++)
		   System.out.println(a[i]);
	}
}
