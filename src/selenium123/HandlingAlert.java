package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		
		alert.click();
		
		Thread.sleep(1000);
		
		//driver.switchTo().alert().accept();
		
	//	System.out.println(driver.switchTo().alert().getText());
		
		String alertMessage=driver.switchTo().alert().getText();
				
		System.out.println(alertMessage);
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
	}

}
