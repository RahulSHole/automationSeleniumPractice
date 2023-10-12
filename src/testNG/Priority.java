package testNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test
	public void verifyLogin()
	{
		System.out.println("code to verify login functionality");
	}
	
	@Test
	public void launchUrl()
	{
		System.out.println("code to launch/open the web page");
	}
	
	@Test
	public void closeBrowser()
	{
		System.out.println("code to close the current browser");
	}
}
