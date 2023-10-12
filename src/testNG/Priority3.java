package testNG;

import org.testng.annotations.Test;

public class Priority3 {
	
	@Test(priority = 'B')
	public void verifyLogin()
	{
		System.out.println("code to verify login functionality");
	}
	
	@Test(priority = 'A')
	public void launchUrl()
	{
		System.out.println("code to launch/open the web page");
	}
	
	@Test(priority = 'C')
	public void closeBrowser()
	{
		System.out.println("code to close the current browser");
	}

}
