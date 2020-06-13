package com.wripo.FlowControlStatements;

public class ex7 {
	public static void main(String args[]){
        char c= args[0].charAt(0);
        int d;
        if(c>='a'&&c<='z')
            d= c-'a'+ 65;
        else
            d=c-'A'+97;
        char a= (char)d;

        System.out.println(a);
    }


}
