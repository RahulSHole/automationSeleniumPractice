package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
	   Thread.sleep(3000);
	   
	   WebElement UN=driver.findElement(By.name("username")); // locate usename by using name locator
	   
	   UN.click();      // to perform click operation
	   
	   UN.sendKeys("Rahulhole1997@gmail.com");
	   
	   Thread.sleep(3000);
	   
	  WebElement PWD=driver.findElement(By.name("password"));
	  
	  PWD.click();
	  
	  Thread.sleep(3000);
	  
	  PWD.sendKeys("Rahul123");
	  
	  Thread.sleep(2000);
	  
	  
	   WebElement Login=driver.findElement(By.tagName("button"));
	   
	   Login.click();
	   
	   Thread.sleep(4000);
	   
	   driver.close();
	   
	}

}
