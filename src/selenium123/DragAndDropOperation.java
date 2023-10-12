package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) throws InterruptedException   {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Thread.sleep(1000);
		
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		
		Thread.sleep(2000);
		
	/*	a.clickAndHold(source).build().perform();
		
		Thread.sleep(1000);
		
		a.moveToElement(target).build().perform();
		
		Thread.sleep(1000);
		
		a.release().build().perform();      */
		
	//	a.dragAndDrop(source, target).build().perform();
		
		a.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
		
		
		
	}

}
