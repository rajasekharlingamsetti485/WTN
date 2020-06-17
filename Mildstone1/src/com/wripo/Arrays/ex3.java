package com.wripo.Arrays;

public class ex3 {
	public static void main(String[] args) {
		int c=Integer.parseInt(args[0]);
		int x=0,y=0;
		for(int i=1;i<(args.length)-1;i++)
		{
			int v=Integer.parseInt(args[i]);
			if(c==v)
			{
				x++;
				y=i;
			}
		}
		if(x!=0)
			System.out.println(y);
		else
			System.out.println("-1");
	}
}
