package com.wripo.FlowControlStatements;

public class ex1 {
	 public static void main(String[] args) 
	    {
	        int number=Integer.parseInt(args[0]);;
	     
	        System.out.print("Enter the number you want to check:");
	     
	        if(number > 0)
	        {
	            System.out.println(number+" is positive number");
	        }
	        else if(number < 0)
	        {
	            System.out.println(number+" is negative number");
	        }
	        else
	        {
	            System.out.println(number+" is Zero");
	        }
	    }

}
