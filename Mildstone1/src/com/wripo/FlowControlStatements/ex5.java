package com.wripo.FlowControlStatements;

public class ex5 {
	 public static void main(String args[]){
	        char c='4';

	        if((c>='a'&& c<='z')||(c>='A' &&c<='Z')){
	            System.out.println("Alphabet");
	        }
	        else if((c>=32 && c<= 47)|| (c>=58 && c<= 64)||(c>=91 && c<= 96)||(c>=123 && c<= 126)){
	            System.out.println("Special Character");
	        }
	        else{
	            System.out.println("Digit");
	        }
	    }
}
