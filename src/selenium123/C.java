package selenium123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

public static void main(String[] args) throws InterruptedException{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	      Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	/*	driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);  */
		
		System.out.println(driver.getTitle());
	   
		System.out.println(driver.getCurrentUrl());
		
		  Thread.sleep(3000);
		  
		  driver.navigate().to("https://www.instagram.com/accounts/login/");
		  
		  System.out.println(driver.getTitle());
		  
		  System.out.println(driver.getCurrentUrl());
		  
		     Thread.sleep(4000);
		     
		     driver.navigate().back();
		     System.out.println("Done");
		     
		     Thread.sleep(3000);
		     
		     driver.navigate().forward();
		     System.out.println("Done");
		     
		     Thread.sleep(4000);
		  
		     driver.close();
		  // driver.quit();
		  
	}

}
