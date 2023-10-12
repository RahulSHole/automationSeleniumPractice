package selenium123;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	        driver.manage().window().maximize();
	        
	        Thread.sleep(2000);
	        
	        WebElement r1=driver.findElement(By.xpath("//input[@value='radio1']"));
	        
	        WebElement r2=driver.findElement(By.xpath("//input[@value='radio2']"));
	        
	        WebElement r3=driver.findElement(By.xpath("//input[@value='radio3']"));
	        
	        System.out.println(r1.isDisplayed());
	        
	        System.out.println(r2.isDisplayed());
	        
	        System.out.println(r3.isDisplayed());
	        
	       System.out.println(r1.isEnabled());
	       
	       System.out.println(r2.isEnabled());
	       
	       System.out.println(r3.isEnabled());
	       
	       r1.click();
	       Thread.sleep(2000);
	       
	       r2.click();
	       Thread.sleep(2000);
	       
	       r3.click();
	       Thread.sleep(2000);
	       
	       
	       System.out.println(r1.isSelected());
	       
	       System.out.println(r2.isSelected());
	       
	       System.out.println(r3.isSelected());
	       
	       
	       List<WebElement> R=driver.findElements(By.xpath("//input[@type='radio']"));
	       
	       //for loop............1st approach
	       
	       for(int i=0; i<R.size(); i++)
	       {
	    	   R.get(i).click();
	    	   Thread.sleep(2000);
	       }
	       
	       //for each loop............2nd approach
	       
	       for(WebElement k:R)
	       {
	    	   k.click();
	    	   Thread.sleep(2000);
	       }
	         driver.close(); 
	  }
	  
             

}
