package testNG;

import org.testng.annotations.Test;

public class Priority4 {
	
	@Test(priority = 24)
	public void verifyLogin()
	{
		System.out.println("code to verify login functionality");
	}
	
	@Test(priority = 20)
	public void launchUrl()
	{
		System.out.println("code to launch/open the web page");
	}
	
	@Test(priority = 29)
	
	public void closeBrowser()
	{
		System.out.println("code to close the current browser");
	}

}
