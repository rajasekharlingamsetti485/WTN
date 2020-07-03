package com.wripo.overriddingandpolymorphism;

class Apple extends Fruit {
	public void eat() {
		System.out.println("It tastes like apple");
	}
}
class Fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "Fruit";
		taste = "Taste of the fruit";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}

class Orange extends Fruit {
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}
public class ex1 {

	public static void main(String[] args) {
		new Fruit().eat();
		new Apple().eat();
		new Orange().eat();

	}

}
