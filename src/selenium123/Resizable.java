package selenium123;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		
		Thread.sleep(1000);
		
		a.clickAndHold(e).moveByOffset(150, 200).release().build().perform();
		
	
		
		
		
	}

}
