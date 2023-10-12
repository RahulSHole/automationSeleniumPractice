package testNG;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWindow {
	
	@Test
	
	public void handlingWindow() throws InterruptedException
	{
		WebDriver d =new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
	//	System.out.println(d.getWindowHandle());
		
		d.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		System.out.println(d.getCurrentUrl());
		
		Thread.sleep(1000);
		
		Set<String> a=d.getWindowHandles();
		
		Iterator<String> it=a.iterator();
		
		String Parent_window=it.next();
		
		String child_window=it.next();
		
	   Thread.sleep(1000);
	   
	   d.switchTo().window(child_window);
	   
	   System.out.println(d.getCurrentUrl());
	   
	   d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
	   
	   Thread.sleep(1000);
	   
	   d.close();
	   
	   d.switchTo().window(Parent_window);
	   
	   System.out.println(d.getCurrentUrl());
	   
	   Thread.sleep(1000);
	   
	      d.close();		
		
		
		
		
	}

}
