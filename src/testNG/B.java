package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class B {
	
	@Test
	
	public void scrollDownOperation() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;  //scrolling Down till we find specific element
		
		js.executeScript("arguments[0].scrollIntoView()",mouseHover);
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);  //create object for actions class first
		
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
