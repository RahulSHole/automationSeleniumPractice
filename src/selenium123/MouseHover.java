package selenium123;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// create object of Actions class
		
		Actions a=new Actions(driver);
		
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
	    Thread.sleep(2000);
	    
	    a.moveToElement(mouseHover).build().perform();
	    
	    Thread.sleep(2000);
	    
	    mouseHover.sendKeys(Keys.ARROW_DOWN);
	    
	    Thread.sleep(1000);
	    
	    mouseHover.sendKeys(Keys.ARROW_DOWN);
	    
	    Thread.sleep(1000);
	    
	    mouseHover.sendKeys(Keys.ENTER);
	    
	 //   WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div"));
	    
	 //     reload.click();
	    
}

}
