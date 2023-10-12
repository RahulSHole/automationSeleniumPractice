package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CsameB {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public void launchUrl() throws InterruptedException
	{
        driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
	}
	
	@AfterMethod
	
	public void closeButton()
	{
		driver.close();
	}
	
	@Test
	
	public void scrollDownOperation() throws InterruptedException
	
	{
	    WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;  //scrolling Down till we find specific element
		
		js.executeScript("arguments[0].scrollIntoView()",mouseHover);
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);  //create object for actions class 
		
		a.moveToElement(mouseHover).build().perform();
		
		Thread.sleep(1000);
		
	/*	mouseHover.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		mouseHover.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		mouseHover.sendKeys(Keys.ENTER);         */
		
		WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		
		Thread.sleep(1000);
		
		reload.click();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
	}
	

}
