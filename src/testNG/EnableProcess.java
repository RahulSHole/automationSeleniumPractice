package testNG;

import org.testng.annotations.Test;

public class EnableProcess {
	
	@Test(enabled = false)
	
	public void ranbeer()
	{
		System.out.println("bramhastra");
	}
	
	@Test(enabled = true)
	
	public void kiara()
	{
		System.out.println("shershah");
	}
	
	@Test
	
	public void siddharth()
	{
		System.out.println("SOTY");
	}

}
