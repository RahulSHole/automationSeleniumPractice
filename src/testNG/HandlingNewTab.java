package testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingNewTab {
	
	@Test
	
	public void handlingTab() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//a[@id='opentab']")).click();
	     
	     Thread.sleep(1000);
	     
	     System.out.println(driver.getCurrentUrl());
	     
	     Set<String> a=driver.getWindowHandles();
	     
	     Iterator<String> it=a.iterator();
	     
	    String parent_tab = it.next();
	    
	    String child_tab = it.next();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().window(child_tab);
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	    
	    System.out.println(driver.getCurrentUrl());
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	    driver.switchTo().window(parent_tab);
	    
	    Thread.sleep(1000);
	    
	    driver.close();
	    
	    
	}

}
