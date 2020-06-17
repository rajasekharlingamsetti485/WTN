package com.wripo.Arrays;

public class ex2 {
	public static void main(String[] args) {
		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[0]);
		for(int i=0;i<args.length;i++)
		{
			int v=Integer.parseInt(args[i]);
			if(max<v)
				max=v;
			if(min>v)
				min=v;
		}
		System.out.println(min+","+max);
	}
}
