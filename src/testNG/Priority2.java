package testNG;

import org.testng.annotations.Test;

public class Priority2 {
	
	@Test(priority = 2)
	public void verifyLogin()
	{
		System.out.println("code to verify login functionality");
	}
	
	@Test(priority = 1)
	public void launchUrl()
	{
		System.out.println("code to launch/open the web page");
	}
	
	@Test(priority = 3)
	public void closeBrowser()
	{
		System.out.println("code to close the current browser");
	}

}
