package org.cap.demo;

public class MainClass 
{
	public static void main(String[] args) 
	{
		SalesClass s = new SalesClass();
		s.show();
		
		System.out.println("Yoo.!! BBye.!!");
		greet();
	}
	
	public static void greet()
	{
		System.out.println("Heel-o");
		
		for(int i=1; i<10; i++)
		{
			System.out.println(i+" ");
		}
	}
}