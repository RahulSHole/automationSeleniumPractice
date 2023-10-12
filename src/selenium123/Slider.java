package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(f);
		
		Thread.sleep(1000);
		
		WebElement slider=driver.findElement(By.xpath("//span[@style='left: 0%;']"));
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		
		Thread.sleep(1000);
		
		a.clickAndHold(slider).moveByOffset(400, 0).release().build().perform();
				
		
		
		
	}

}
