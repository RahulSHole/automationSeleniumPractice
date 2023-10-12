package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
		//here full content/spelling is required
		//case sensitive
		
		System.out.println(link1.isDisplayed());
		
		System.out.println(link1.isEnabled());
		
		System.out.println(link1.isSelected());
		
		//link1.click();
		
		WebElement link2=driver.findElement(By.partialLinkText("Use Custom"));
		
		System.out.println(link2.isDisplayed());
		
		System.out.println(link2.isEnabled());
		
		System.out.println(link2.isSelected());
		
		//link2.click();
		
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='w0 pr ln3 p16 remember']/input"));
		
		checkbox.click();
		
		Thread.sleep(3000);
		
		checkbox.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		

		
		   
		   
		   
		
		
		
	}

}
