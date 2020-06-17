package com.wripo.Arrays;

public class ex5 {
	public static void main (String args[])
	{
	int i,min2=0,max2=0;
	int[] a=new int[args.length];
	for( i=0;i<args.length;i++)
	   a[i]=Integer.parseInt(args[i]);
	 int max=a[0]; 
	 int min=a[0];
	for(i=0;i<args.length;i++)
	{
	if(min>a[i])
	{
	 min2=min;
	min=a[i];
	}
	if(max<a[i])
	{
	max2=max;
	max=a[i];
	}
	}
	 System.out.println(max+","+max2+","+min+","+min2);
	}
}
