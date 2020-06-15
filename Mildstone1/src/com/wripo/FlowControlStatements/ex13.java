package com.wripo.FlowControlStatements;

public class ex13 {
	public static void main(String args[])
	{
		 int i=0;
	     int a=0;
	     String  prime="";

	       for (i=10;i<=99;i++)         
	       { 		  	  
	          int count=0; 	  
	          for(a=i;a>=1;a--)
		  {
	             if(i%a==0)
		     {
	 		count=count+1;
		     }
		  }
		  if(count==2)
		  {
		     prime=prime+ i + " ";
		  }	
	       }	
	       System.out.println(prime);
	}


}
