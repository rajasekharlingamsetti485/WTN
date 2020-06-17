package com.wripo.Arrays;

public class ex8 {
	public static void main(String[] args) {
		int i,c=0,d=0,s=0,v=0;
		for(i=0;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			if(x==6)
				c=i;
			if(x==7)
				d=i;
			s+=x;
		}
		if(c<d)
		{
			for(i=c;i<=d;i++)
			{
				int x=Integer.parseInt(args[i]);
				v+=x;
			}
			s-=v;
		}
		System.out.println(s);
	}
}
