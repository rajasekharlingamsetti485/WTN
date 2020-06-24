package com.wripo.ClassesandObjects;

public class ex1 {
	class Cuboid {
		private int width;
		private int depth;
		private int hieght;
		Cuboid(int width,int hieght, int depth)
		{
			this.width=width;
			this.hieght=hieght;
			this.depth=depth;
		}
		public double Volume ()
		{
		 return width*hieght*depth;
		}
		}
		public class Box {
			public static void main(String[] args) {
				Cuboid sc=new Cuboid(10,20,30);
				double volume= sc.Volume();
				System.out.println(volume);
			}
		}
}
