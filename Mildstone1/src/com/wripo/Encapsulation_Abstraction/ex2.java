package com.wripo.Encapsulation_Abstraction;
class Author{
    public static String email;
   public static char gender;
    public static String name;
    Author(String n,String e,char g)
    {
        name=n;
        email=e;
        gender=g;
    }
    
    
}
class Book{
    String name1,author;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name1=n1;
        
    }
    public void setPrice()
    {
        price=1200;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=20;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+Author.name);
       System.out.println("The email id is :"+Author.email);
       System.out.println("The gender is :"+Author.gender);
    }
    
}
public class ex2 {
	   public static void main(String args[])
	    {
	        Book b=new Book("EC");
	        Author a=new Author("Rajasekhar","rajasekharlingamsetti@gmail.com",'M');
	        b.setPrice();
	        b.setQtyInStock();
	        System.out.println("The name of the book is :"+b.getName());
	        System.out.println("The price of the book is :"+b.getPrice());
	        System.out.println("The stock is :"+b.getQtyInStock());
	        b.getAuthor();
	        
	    }
}
