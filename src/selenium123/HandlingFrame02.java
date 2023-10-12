package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// entering into the frame by name
		
	/*	driver.switchTo().frame("iframe-name");
		
		Thread.sleep(2000);     */
		
		 WebElement f=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		
		driver.switchTo().frame(f); 
		
		Thread.sleep(3000);            
		
		WebElement blog=driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a"));
		
		blog.click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		
		alert.click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
		
	}

}
