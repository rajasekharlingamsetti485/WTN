package com.wripo.Arrays;

public class ex14 {
	public static void main(String[] args) {
		int i,j,k=0;
		int a[][]= new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				int x=Integer.parseInt(args[k]);
				a[i][j]=x;
				k++;
			}
		}
		int max=a[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		System.out.println(max);
	}
}

