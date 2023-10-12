package testNG;

import org.testng.annotations.Test;

public class DependsOnMethodDemo {
	
	@Test
	
	public void enterUrl()
	{
		System.out.println("code to open/launch url");
	}

	@Test(dependsOnMethods = "enterUrl")
	
	public void closeBrowser()
	{
		System.out.println("code to close the current browser");
	}
}
