package com.wripo.day9;
import java.io.*; 
import java.util.*; 
  
public class ex2 { 
  
    static boolean isPalindrome(String s) 
    { 
        
        String s1 = ""; 
  
       
        int N = s.length(); 
  
        for (int i = N - 1; i >= 0; i--) 
            s1 += s.charAt(i); 
  
        if (s.equals(s1)) 
            return true; 
        return false; 
    } 
  
    static boolean createString(int N) 
    { 
        String str = ""; 
        String s = "" + N; 
  
      
        String letters = "abcdefghij"; 
       
        int sum = 0; 
        String substr = ""; 
        for (int i = 0; i < s.length(); i++) { 
            int digit = s.charAt(i) - '0'; 
            substr += letters.charAt(digit); 
            sum += digit; 
        } 
        while (str.length() <= sum) { 
            str += substr; 
        } 
        str = str.substring(0, sum); 
  
        return isPalindrome(str); 
    }  
    public static void main(String args[]) 
    { 
        int N = 61;  
        boolean flag = createString(N); 
        if (flag) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

