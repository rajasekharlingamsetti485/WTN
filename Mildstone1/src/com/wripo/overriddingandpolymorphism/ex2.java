package com.wripo.overriddingandpolymorphism;
public class ex2 {
	  public static void main(String[] args) {
		  ex2 c=new Circle();
		  ex2  t=new Triangle();
		  ex2  s=new Square();
	    c.draw();
	    c.erase();
	    t.draw();
	    t.erase();
	    s.draw();
	    s.erase();
	    
	  }
	void draw()
	{
	  System.out.println("Drawing Shape");
	}
	void erase()
	{
	  System.out.println("Erasing Shape");
	}

	}

	class Circle extends ex2 {
	  void draw()
	  {
	    System.out.println("Drawing circle");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Cirle");
	  }
	}

	class Triangle extends ex2 {
	  void draw()
	  {
	    System.out.println("Drawing Triangle");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Triangle");
	  }
	}

	class Square extends ex2 {
	  void draw()
	  {
	    System.out.println("Drawing Square");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Square");
	  }
	}