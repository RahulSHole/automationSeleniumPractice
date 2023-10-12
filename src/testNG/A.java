package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A {
	
	@BeforeClass
	
	public void a()
	{
		System.out.println("this code will execute before class");
	}
	
	@AfterClass
	
	public void b()
	{
		System.out.println("this code will execute after class");
	}
	
	@Test
	
	public void c()
	{
		System.out.println("Hello");
	}
	
	@Test
	
	public void d()
	{
		System.out.println("Rahul");
	}

}
