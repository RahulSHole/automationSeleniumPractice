package selenium123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
	//	checkbox1.click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		System.out.println(checkbox1.isDisplayed());   //to check it is present on webpage
		
		System.out.println(checkbox1.isEnabled());
		
		System.out.println(checkbox1.isSelected());
		
		checkbox1.click();
		
		Thread.sleep(2000);
		
		System.out.println(checkbox1.isSelected());
		
		List<WebElement> a=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//for loop......... first approach
		
		for(int i=0; i<a.size(); i++)
		{
			a.get(i).click();
			Thread.sleep(2000);
		}
		
		//for each loop ........second approach
		
		for(WebElement k:a)
		{
			k.click();
			Thread.sleep(3000);
		}
		
		
		
		
		
		
	}

}
