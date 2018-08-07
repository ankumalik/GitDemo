package org.cap.demo;

public class MainClass 
{
	public static void main(String[] args) 
	{
		SalesClass sale = new SalesClass();
		sale.show();
		
		System.out.println("Ankit");
		
		MarketingClass m = new MarketingClass();
		m.market();
		
		CustClass c = new CustClass();
		c.cust();
		
		MoneyClass mc = new MoneyClass();
		mc.money();
		
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